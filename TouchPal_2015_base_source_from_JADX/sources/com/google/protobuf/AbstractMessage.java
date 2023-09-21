package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.Internal;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class AbstractMessage extends AbstractMessageLite implements Message {
    private int memoizedSize = -1;

    public boolean isInitialized() {
        for (Descriptors.FieldDescriptor next : getDescriptorForType().getFields()) {
            if (next.isRequired() && !hasField(next)) {
                return false;
            }
        }
        for (Map.Entry next2 : getAllFields().entrySet()) {
            Descriptors.FieldDescriptor fieldDescriptor = (Descriptors.FieldDescriptor) next2.getKey();
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (fieldDescriptor.isRepeated()) {
                    for (Message isInitialized : (List) next2.getValue()) {
                        if (!isInitialized.isInitialized()) {
                            return false;
                        }
                    }
                    continue;
                } else if (!((Message) next2.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final String toString() {
        return TextFormat.printToString((Message) this);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean messageSetWireFormat = getDescriptorForType().getOptions().getMessageSetWireFormat();
        for (Map.Entry next : getAllFields().entrySet()) {
            Descriptors.FieldDescriptor fieldDescriptor = (Descriptors.FieldDescriptor) next.getKey();
            Object value = next.getValue();
            if (!messageSetWireFormat || !fieldDescriptor.isExtension() || fieldDescriptor.getType() != Descriptors.FieldDescriptor.Type.MESSAGE || fieldDescriptor.isRepeated()) {
                FieldSet.writeField(fieldDescriptor, value, codedOutputStream);
            } else {
                codedOutputStream.writeMessageSetExtension(fieldDescriptor.getNumber(), (Message) value);
            }
        }
        UnknownFieldSet unknownFields = getUnknownFields();
        if (messageSetWireFormat) {
            unknownFields.writeAsMessageSetTo(codedOutputStream);
        } else {
            unknownFields.writeTo(codedOutputStream);
        }
    }

    public int getSerializedSize() {
        int i;
        int computeFieldSize;
        int i2 = this.memoizedSize;
        if (i2 == -1) {
            int i3 = 0;
            boolean messageSetWireFormat = getDescriptorForType().getOptions().getMessageSetWireFormat();
            Iterator<Map.Entry<Descriptors.FieldDescriptor, Object>> it = getAllFields().entrySet().iterator();
            while (true) {
                i = i3;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                Descriptors.FieldDescriptor fieldDescriptor = (Descriptors.FieldDescriptor) next.getKey();
                Object value = next.getValue();
                if (!messageSetWireFormat || !fieldDescriptor.isExtension() || fieldDescriptor.getType() != Descriptors.FieldDescriptor.Type.MESSAGE || fieldDescriptor.isRepeated()) {
                    computeFieldSize = FieldSet.computeFieldSize(fieldDescriptor, value);
                } else {
                    computeFieldSize = CodedOutputStream.computeMessageSetExtensionSize(fieldDescriptor.getNumber(), (Message) value);
                }
                i3 = computeFieldSize + i;
            }
            UnknownFieldSet unknownFields = getUnknownFields();
            if (messageSetWireFormat) {
                i2 = unknownFields.getSerializedSizeAsMessageSet() + i;
            } else {
                i2 = unknownFields.getSerializedSize() + i;
            }
            this.memoizedSize = i2;
        }
        return i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        if (getDescriptorForType() != message.getDescriptorForType()) {
            return false;
        }
        if (!getAllFields().equals(message.getAllFields()) || !getUnknownFields().equals(message.getUnknownFields())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (hashFields(getDescriptorForType().hashCode() + 779, getAllFields()) * 29) + getUnknownFields().hashCode();
    }

    /* access modifiers changed from: protected */
    public int hashFields(int i, Map<Descriptors.FieldDescriptor, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            Descriptors.FieldDescriptor fieldDescriptor = (Descriptors.FieldDescriptor) next.getKey();
            Object value = next.getValue();
            int number = (i * 37) + fieldDescriptor.getNumber();
            if (fieldDescriptor.getType() != Descriptors.FieldDescriptor.Type.ENUM) {
                i = (number * 53) + value.hashCode();
            } else if (fieldDescriptor.isRepeated()) {
                i = (number * 53) + hashEnumList((List) value);
            } else {
                i = (number * 53) + hashEnum((Internal.EnumLite) value);
            }
        }
        return i;
    }

    protected static int hashLong(long j) {
        return (int) ((j >>> 32) ^ j);
    }

    protected static int hashBoolean(boolean z) {
        return z ? 1231 : 1237;
    }

    protected static int hashEnum(Internal.EnumLite enumLite) {
        return enumLite.getNumber();
    }

    protected static int hashEnumList(List<? extends Internal.EnumLite> list) {
        int i = 1;
        Iterator<? extends Internal.EnumLite> it = list.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = hashEnum((Internal.EnumLite) it.next()) + (i2 * 31);
        }
    }

    public static abstract class Builder<BuilderType extends Builder> extends AbstractMessageLite.Builder<BuilderType> implements Message.Builder {
        public abstract BuilderType clone();

        public BuilderType clear() {
            for (Map.Entry<Descriptors.FieldDescriptor, Object> key : getAllFields().entrySet()) {
                clearField((Descriptors.FieldDescriptor) key.getKey());
            }
            return this;
        }

        public BuilderType mergeFrom(Message message) {
            if (message.getDescriptorForType() != getDescriptorForType()) {
                throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
            }
            for (Map.Entry next : message.getAllFields().entrySet()) {
                Descriptors.FieldDescriptor fieldDescriptor = (Descriptors.FieldDescriptor) next.getKey();
                if (fieldDescriptor.isRepeated()) {
                    for (Object addRepeatedField : (List) next.getValue()) {
                        addRepeatedField(fieldDescriptor, addRepeatedField);
                    }
                } else if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    Message message2 = (Message) getField(fieldDescriptor);
                    if (message2 == message2.getDefaultInstanceForType()) {
                        setField(fieldDescriptor, next.getValue());
                    } else {
                        setField(fieldDescriptor, message2.newBuilderForType().mergeFrom(message2).mergeFrom((Message) next.getValue()).build());
                    }
                } else {
                    setField(fieldDescriptor, next.getValue());
                }
            }
            mergeUnknownFields(message.getUnknownFields());
            return this;
        }

        public BuilderType mergeFrom(CodedInputStream codedInputStream) throws IOException {
            return mergeFrom(codedInputStream, (ExtensionRegistryLite) ExtensionRegistry.getEmptyRegistry());
        }

        public BuilderType mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readTag;
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder(getUnknownFields());
            do {
                readTag = codedInputStream.readTag();
                if (readTag == 0 || !mergeFieldFrom(codedInputStream, newBuilder, extensionRegistryLite, this, readTag)) {
                    setUnknownFields(newBuilder.build());
                }
                readTag = codedInputStream.readTag();
                break;
            } while (!mergeFieldFrom(codedInputStream, newBuilder, extensionRegistryLite, this, readTag));
            setUnknownFields(newBuilder.build());
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.protobuf.Message} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.google.protobuf.Descriptors$FieldDescriptor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.google.protobuf.Descriptors$FieldDescriptor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.protobuf.Message} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.google.protobuf.Descriptors$FieldDescriptor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: com.google.protobuf.Descriptors$FieldDescriptor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: com.google.protobuf.Message} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.google.protobuf.Descriptors$FieldDescriptor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: com.google.protobuf.Message} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: com.google.protobuf.Message} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: com.google.protobuf.Message} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static boolean mergeFieldFrom(com.google.protobuf.CodedInputStream r8, com.google.protobuf.UnknownFieldSet.Builder r9, com.google.protobuf.ExtensionRegistryLite r10, com.google.protobuf.Message.Builder r11, int r12) throws java.io.IOException {
            /*
                r1 = 0
                r3 = 0
                r2 = 1
                com.google.protobuf.Descriptors$Descriptor r4 = r11.getDescriptorForType()
                com.google.protobuf.DescriptorProtos$MessageOptions r0 = r4.getOptions()
                boolean r0 = r0.getMessageSetWireFormat()
                if (r0 == 0) goto L_0x001a
                int r0 = com.google.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG
                if (r12 != r0) goto L_0x001a
                mergeMessageSetExtensionFromCodedStream(r8, r9, r10, r11)
                r0 = r2
            L_0x0019:
                return r0
            L_0x001a:
                int r5 = com.google.protobuf.WireFormat.getTagWireType(r12)
                int r6 = com.google.protobuf.WireFormat.getTagFieldNumber(r12)
                boolean r0 = r4.isExtensionNumber(r6)
                if (r0 == 0) goto L_0x0070
                boolean r0 = r10 instanceof com.google.protobuf.ExtensionRegistry
                if (r0 == 0) goto L_0x006e
                r0 = r10
                com.google.protobuf.ExtensionRegistry r0 = (com.google.protobuf.ExtensionRegistry) r0
                com.google.protobuf.ExtensionRegistry$ExtensionInfo r0 = r0.findExtensionByNumber(r4, r6)
                if (r0 != 0) goto L_0x0043
                r0 = r1
            L_0x0036:
                r4 = r1
                r1 = r0
            L_0x0038:
                if (r4 != 0) goto L_0x0076
                r0 = r3
                r3 = r2
            L_0x003c:
                if (r3 == 0) goto L_0x0097
                boolean r0 = r9.mergeFieldFrom(r12, r8)
                goto L_0x0019
            L_0x0043:
                com.google.protobuf.Descriptors$FieldDescriptor r1 = r0.descriptor
                com.google.protobuf.Message r0 = r0.defaultInstance
                if (r0 != 0) goto L_0x0036
                com.google.protobuf.Descriptors$FieldDescriptor$JavaType r4 = r1.getJavaType()
                com.google.protobuf.Descriptors$FieldDescriptor$JavaType r7 = com.google.protobuf.Descriptors.FieldDescriptor.JavaType.MESSAGE
                if (r4 != r7) goto L_0x0036
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Message-typed extension lacked default instance: "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r1 = r1.getFullName()
                java.lang.StringBuilder r1 = r2.append(r1)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x006e:
                r4 = r1
                goto L_0x0038
            L_0x0070:
                com.google.protobuf.Descriptors$FieldDescriptor r0 = r4.findFieldByNumber(r6)
                r4 = r0
                goto L_0x0038
            L_0x0076:
                com.google.protobuf.WireFormat$FieldType r0 = r4.getLiteType()
                int r0 = com.google.protobuf.FieldSet.getWireFormatForFieldType(r0, r3)
                if (r5 != r0) goto L_0x0082
                r0 = r3
                goto L_0x003c
            L_0x0082:
                boolean r0 = r4.isPackable()
                if (r0 == 0) goto L_0x0094
                com.google.protobuf.WireFormat$FieldType r0 = r4.getLiteType()
                int r0 = com.google.protobuf.FieldSet.getWireFormatForFieldType(r0, r2)
                if (r5 != r0) goto L_0x0094
                r0 = r2
                goto L_0x003c
            L_0x0094:
                r0 = r3
                r3 = r2
                goto L_0x003c
            L_0x0097:
                if (r0 == 0) goto L_0x00dc
                int r0 = r8.readRawVarint32()
                int r0 = r8.pushLimit(r0)
                com.google.protobuf.WireFormat$FieldType r1 = r4.getLiteType()
                com.google.protobuf.WireFormat$FieldType r3 = com.google.protobuf.WireFormat.FieldType.ENUM
                if (r1 != r3) goto L_0x00c4
            L_0x00a9:
                int r1 = r8.getBytesUntilLimit()
                if (r1 <= 0) goto L_0x00d6
                int r1 = r8.readEnum()
                com.google.protobuf.Descriptors$EnumDescriptor r3 = r4.getEnumType()
                com.google.protobuf.Descriptors$EnumValueDescriptor r1 = r3.findValueByNumber((int) r1)
                if (r1 != 0) goto L_0x00c0
                r0 = r2
                goto L_0x0019
            L_0x00c0:
                r11.addRepeatedField(r4, r1)
                goto L_0x00a9
            L_0x00c4:
                int r1 = r8.getBytesUntilLimit()
                if (r1 <= 0) goto L_0x00d6
                com.google.protobuf.WireFormat$FieldType r1 = r4.getLiteType()
                java.lang.Object r1 = com.google.protobuf.FieldSet.readPrimitiveField(r8, r1)
                r11.addRepeatedField(r4, r1)
                goto L_0x00c4
            L_0x00d6:
                r8.popLimit(r0)
            L_0x00d9:
                r0 = r2
                goto L_0x0019
            L_0x00dc:
                int[] r0 = com.google.protobuf.AbstractMessage.C39411.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type
                com.google.protobuf.Descriptors$FieldDescriptor$Type r3 = r4.getType()
                int r3 = r3.ordinal()
                r0 = r0[r3]
                switch(r0) {
                    case 1: goto L_0x00fd;
                    case 2: goto L_0x0125;
                    case 3: goto L_0x0149;
                    default: goto L_0x00eb;
                }
            L_0x00eb:
                com.google.protobuf.WireFormat$FieldType r0 = r4.getLiteType()
                java.lang.Object r0 = com.google.protobuf.FieldSet.readPrimitiveField(r8, r0)
            L_0x00f3:
                boolean r1 = r4.isRepeated()
                if (r1 == 0) goto L_0x015d
                r11.addRepeatedField(r4, r0)
                goto L_0x00d9
            L_0x00fd:
                if (r1 == 0) goto L_0x011f
                com.google.protobuf.Message$Builder r0 = r1.newBuilderForType()
                r1 = r0
            L_0x0104:
                boolean r0 = r4.isRepeated()
                if (r0 != 0) goto L_0x0113
                java.lang.Object r0 = r11.getField(r4)
                com.google.protobuf.Message r0 = (com.google.protobuf.Message) r0
                r1.mergeFrom((com.google.protobuf.Message) r0)
            L_0x0113:
                int r0 = r4.getNumber()
                r8.readGroup(r0, r1, r10)
                com.google.protobuf.Message r0 = r1.build()
                goto L_0x00f3
            L_0x011f:
                com.google.protobuf.Message$Builder r0 = r11.newBuilderForField(r4)
                r1 = r0
                goto L_0x0104
            L_0x0125:
                if (r1 == 0) goto L_0x0143
                com.google.protobuf.Message$Builder r0 = r1.newBuilderForType()
                r1 = r0
            L_0x012c:
                boolean r0 = r4.isRepeated()
                if (r0 != 0) goto L_0x013b
                java.lang.Object r0 = r11.getField(r4)
                com.google.protobuf.Message r0 = (com.google.protobuf.Message) r0
                r1.mergeFrom((com.google.protobuf.Message) r0)
            L_0x013b:
                r8.readMessage(r1, r10)
                com.google.protobuf.Message r0 = r1.build()
                goto L_0x00f3
            L_0x0143:
                com.google.protobuf.Message$Builder r0 = r11.newBuilderForField(r4)
                r1 = r0
                goto L_0x012c
            L_0x0149:
                int r1 = r8.readEnum()
                com.google.protobuf.Descriptors$EnumDescriptor r0 = r4.getEnumType()
                com.google.protobuf.Descriptors$EnumValueDescriptor r0 = r0.findValueByNumber((int) r1)
                if (r0 != 0) goto L_0x00f3
                r9.mergeVarintField(r6, r1)
                r0 = r2
                goto L_0x0019
            L_0x015d:
                r11.setField(r4, r0)
                goto L_0x00d9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractMessage.Builder.mergeFieldFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.UnknownFieldSet$Builder, com.google.protobuf.ExtensionRegistryLite, com.google.protobuf.Message$Builder, int):boolean");
        }

        private static void mergeMessageSetExtensionFromCodedStream(CodedInputStream codedInputStream, UnknownFieldSet.Builder builder, ExtensionRegistryLite extensionRegistryLite, Message.Builder builder2) throws IOException {
            Descriptors.FieldDescriptor fieldDescriptor;
            Message.Builder builder3;
            ByteString byteString;
            int i;
            ExtensionRegistry.ExtensionInfo extensionInfo;
            Descriptors.Descriptor descriptorForType = builder2.getDescriptorForType();
            int i2 = 0;
            Descriptors.FieldDescriptor fieldDescriptor2 = null;
            Message.Builder builder4 = null;
            ByteString byteString2 = null;
            while (true) {
                int readTag = codedInputStream.readTag();
                if (readTag == 0) {
                    break;
                }
                if (readTag == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                    i2 = codedInputStream.readUInt32();
                    if (i2 != 0) {
                        if (extensionRegistryLite instanceof ExtensionRegistry) {
                            extensionInfo = ((ExtensionRegistry) extensionRegistryLite).findExtensionByNumber(descriptorForType, i2);
                        } else {
                            extensionInfo = null;
                        }
                        if (extensionInfo != null) {
                            Descriptors.FieldDescriptor fieldDescriptor3 = extensionInfo.descriptor;
                            Message.Builder newBuilderForType = extensionInfo.defaultInstance.newBuilderForType();
                            Message message = (Message) builder2.getField(fieldDescriptor3);
                            if (message != null) {
                                newBuilderForType.mergeFrom(message);
                            }
                            if (byteString2 != null) {
                                newBuilderForType.mergeFrom(CodedInputStream.newInstance(byteString2.newInput()));
                                byteString2 = null;
                            }
                            fieldDescriptor = fieldDescriptor3;
                            builder3 = newBuilderForType;
                            byteString = byteString2;
                        } else if (byteString2 != null) {
                            builder.mergeField(i2, UnknownFieldSet.Field.newBuilder().addLengthDelimited(byteString2).build());
                            fieldDescriptor = fieldDescriptor2;
                            builder3 = builder4;
                            byteString = null;
                        } else {
                            fieldDescriptor = fieldDescriptor2;
                            builder3 = builder4;
                            byteString = byteString2;
                        }
                        i = i2;
                    }
                    fieldDescriptor = fieldDescriptor2;
                    builder3 = builder4;
                    byteString = byteString2;
                    i = i2;
                } else if (readTag != WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                    if (!codedInputStream.skipField(readTag)) {
                        break;
                    }
                    fieldDescriptor = fieldDescriptor2;
                    builder3 = builder4;
                    byteString = byteString2;
                    i = i2;
                } else if (i2 == 0) {
                    i = i2;
                    Message.Builder builder5 = builder4;
                    byteString = codedInputStream.readBytes();
                    fieldDescriptor = fieldDescriptor2;
                    builder3 = builder5;
                } else if (builder4 == null) {
                    builder.mergeField(i2, UnknownFieldSet.Field.newBuilder().addLengthDelimited(codedInputStream.readBytes()).build());
                    fieldDescriptor = fieldDescriptor2;
                    builder3 = builder4;
                    byteString = byteString2;
                    i = i2;
                } else {
                    codedInputStream.readMessage(builder4, extensionRegistryLite);
                    fieldDescriptor = fieldDescriptor2;
                    builder3 = builder4;
                    byteString = byteString2;
                    i = i2;
                }
                i2 = i;
                byteString2 = byteString;
                builder4 = builder3;
                fieldDescriptor2 = fieldDescriptor;
            }
            codedInputStream.checkLastTagWas(WireFormat.MESSAGE_SET_ITEM_END_TAG);
            if (builder4 != null) {
                builder2.setField(fieldDescriptor2, builder4.build());
            }
        }

        public BuilderType mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            setUnknownFields(UnknownFieldSet.newBuilder(getUnknownFields()).mergeFrom(unknownFieldSet).build());
            return this;
        }

        protected static UninitializedMessageException newUninitializedMessageException(Message message) {
            return new UninitializedMessageException(findMissingFields(message));
        }

        private static List<String> findMissingFields(Message message) {
            ArrayList arrayList = new ArrayList();
            findMissingFields(message, "", arrayList);
            return arrayList;
        }

        private static void findMissingFields(Message message, String str, List<String> list) {
            for (Descriptors.FieldDescriptor next : message.getDescriptorForType().getFields()) {
                if (next.isRequired() && !message.hasField(next)) {
                    list.add(str + next.getName());
                }
            }
            for (Map.Entry next2 : message.getAllFields().entrySet()) {
                Descriptors.FieldDescriptor fieldDescriptor = (Descriptors.FieldDescriptor) next2.getKey();
                Object value = next2.getValue();
                if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    if (fieldDescriptor.isRepeated()) {
                        int i = 0;
                        for (Message findMissingFields : (List) value) {
                            findMissingFields(findMissingFields, subMessagePrefix(str, fieldDescriptor, i), list);
                            i++;
                        }
                    } else if (message.hasField(fieldDescriptor)) {
                        findMissingFields((Message) value, subMessagePrefix(str, fieldDescriptor, -1), list);
                    }
                }
            }
        }

        private static String subMessagePrefix(String str, Descriptors.FieldDescriptor fieldDescriptor, int i) {
            StringBuilder sb = new StringBuilder(str);
            if (fieldDescriptor.isExtension()) {
                sb.append('(').append(fieldDescriptor.getFullName()).append(')');
            } else {
                sb.append(fieldDescriptor.getName());
            }
            if (i != -1) {
                sb.append('[').append(i).append(']');
            }
            sb.append('.');
            return sb.toString();
        }

        public BuilderType mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Builder) super.mergeFrom(byteString);
        }

        public BuilderType mergeFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Builder) super.mergeFrom(byteString, extensionRegistryLite);
        }

        public BuilderType mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Builder) super.mergeFrom(bArr);
        }

        public BuilderType mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            return (Builder) super.mergeFrom(bArr, i, i2);
        }

        public BuilderType mergeFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Builder) super.mergeFrom(bArr, extensionRegistryLite);
        }

        public BuilderType mergeFrom(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Builder) super.mergeFrom(bArr, i, i2, extensionRegistryLite);
        }

        public BuilderType mergeFrom(InputStream inputStream) throws IOException {
            return (Builder) super.mergeFrom(inputStream);
        }

        public BuilderType mergeFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Builder) super.mergeFrom(inputStream, extensionRegistryLite);
        }

        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            return super.mergeDelimitedFrom(inputStream);
        }

        public boolean mergeDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return super.mergeDelimitedFrom(inputStream, extensionRegistryLite);
        }
    }
}
