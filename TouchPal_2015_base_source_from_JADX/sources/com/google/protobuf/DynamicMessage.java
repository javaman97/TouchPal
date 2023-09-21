package com.google.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Descriptors;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public final class DynamicMessage extends AbstractMessage {
    /* access modifiers changed from: private */
    public final FieldSet<Descriptors.FieldDescriptor> fields;
    private int memoizedSize;
    /* access modifiers changed from: private */
    public final Descriptors.Descriptor type;
    /* access modifiers changed from: private */
    public final UnknownFieldSet unknownFields;

    private DynamicMessage(Descriptors.Descriptor descriptor, FieldSet<Descriptors.FieldDescriptor> fieldSet, UnknownFieldSet unknownFieldSet) {
        this.memoizedSize = -1;
        this.type = descriptor;
        this.fields = fieldSet;
        this.unknownFields = unknownFieldSet;
    }

    public static DynamicMessage getDefaultInstance(Descriptors.Descriptor descriptor) {
        return new DynamicMessage(descriptor, FieldSet.emptySet(), UnknownFieldSet.getDefaultInstance());
    }

    public static DynamicMessage parseFrom(Descriptors.Descriptor descriptor, CodedInputStream codedInputStream) throws IOException {
        return ((Builder) newBuilder(descriptor).mergeFrom(codedInputStream)).buildParsed();
    }

    public static DynamicMessage parseFrom(Descriptors.Descriptor descriptor, CodedInputStream codedInputStream, ExtensionRegistry extensionRegistry) throws IOException {
        return ((Builder) newBuilder(descriptor).mergeFrom(codedInputStream, (ExtensionRegistryLite) extensionRegistry)).buildParsed();
    }

    public static DynamicMessage parseFrom(Descriptors.Descriptor descriptor, ByteString byteString) throws InvalidProtocolBufferException {
        return ((Builder) newBuilder(descriptor).mergeFrom(byteString)).buildParsed();
    }

    public static DynamicMessage parseFrom(Descriptors.Descriptor descriptor, ByteString byteString, ExtensionRegistry extensionRegistry) throws InvalidProtocolBufferException {
        return ((Builder) newBuilder(descriptor).mergeFrom(byteString, (ExtensionRegistryLite) extensionRegistry)).buildParsed();
    }

    public static DynamicMessage parseFrom(Descriptors.Descriptor descriptor, byte[] bArr) throws InvalidProtocolBufferException {
        return ((Builder) newBuilder(descriptor).mergeFrom(bArr)).buildParsed();
    }

    public static DynamicMessage parseFrom(Descriptors.Descriptor descriptor, byte[] bArr, ExtensionRegistry extensionRegistry) throws InvalidProtocolBufferException {
        return ((Builder) newBuilder(descriptor).mergeFrom(bArr, (ExtensionRegistryLite) extensionRegistry)).buildParsed();
    }

    public static DynamicMessage parseFrom(Descriptors.Descriptor descriptor, InputStream inputStream) throws IOException {
        return ((Builder) newBuilder(descriptor).mergeFrom(inputStream)).buildParsed();
    }

    public static DynamicMessage parseFrom(Descriptors.Descriptor descriptor, InputStream inputStream, ExtensionRegistry extensionRegistry) throws IOException {
        return ((Builder) newBuilder(descriptor).mergeFrom(inputStream, (ExtensionRegistryLite) extensionRegistry)).buildParsed();
    }

    public static Builder newBuilder(Descriptors.Descriptor descriptor) {
        return new Builder(descriptor);
    }

    public static Builder newBuilder(Message message) {
        return new Builder(message.getDescriptorForType()).mergeFrom(message);
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return this.type;
    }

    public DynamicMessage getDefaultInstanceForType() {
        return getDefaultInstance(this.type);
    }

    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        return this.fields.getAllFields();
    }

    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        verifyContainingType(fieldDescriptor);
        return this.fields.hasField(fieldDescriptor);
    }

    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        verifyContainingType(fieldDescriptor);
        Object field = this.fields.getField(fieldDescriptor);
        if (field != null) {
            return field;
        }
        if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            return getDefaultInstance(fieldDescriptor.getMessageType());
        }
        return fieldDescriptor.getDefaultValue();
    }

    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        verifyContainingType(fieldDescriptor);
        return this.fields.getRepeatedFieldCount(fieldDescriptor);
    }

    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
        verifyContainingType(fieldDescriptor);
        return this.fields.getRepeatedField(fieldDescriptor, i);
    }

    public UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    /* access modifiers changed from: private */
    public static boolean isInitialized(Descriptors.Descriptor descriptor, FieldSet<Descriptors.FieldDescriptor> fieldSet) {
        for (Descriptors.FieldDescriptor next : descriptor.getFields()) {
            if (next.isRequired() && !fieldSet.hasField(next)) {
                return false;
            }
        }
        return fieldSet.isInitialized();
    }

    public boolean isInitialized() {
        return isInitialized(this.type, this.fields);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.type.getOptions().getMessageSetWireFormat()) {
            this.fields.writeMessageSetTo(codedOutputStream);
            this.unknownFields.writeAsMessageSetTo(codedOutputStream);
            return;
        }
        this.fields.writeTo(codedOutputStream);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i == -1) {
            if (this.type.getOptions().getMessageSetWireFormat()) {
                i = this.fields.getMessageSetSerializedSize() + this.unknownFields.getSerializedSizeAsMessageSet();
            } else {
                i = this.fields.getSerializedSize() + this.unknownFields.getSerializedSize();
            }
            this.memoizedSize = i;
        }
        return i;
    }

    public Builder newBuilderForType() {
        return new Builder(this.type);
    }

    public Builder toBuilder() {
        return newBuilderForType().mergeFrom((Message) this);
    }

    private void verifyContainingType(Descriptors.FieldDescriptor fieldDescriptor) {
        if (fieldDescriptor.getContainingType() != this.type) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    public static final class Builder extends AbstractMessage.Builder<Builder> {
        private FieldSet<Descriptors.FieldDescriptor> fields;
        private final Descriptors.Descriptor type;
        private UnknownFieldSet unknownFields;

        private Builder(Descriptors.Descriptor descriptor) {
            this.type = descriptor;
            this.fields = FieldSet.newFieldSet();
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public Builder clear() {
            if (this.fields == null) {
                throw new IllegalStateException("Cannot call clear() after build().");
            }
            this.fields.clear();
            return this;
        }

        public Builder mergeFrom(Message message) {
            if (!(message instanceof DynamicMessage)) {
                return (Builder) super.mergeFrom(message);
            }
            DynamicMessage dynamicMessage = (DynamicMessage) message;
            if (dynamicMessage.type != this.type) {
                throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
            }
            this.fields.mergeFrom(dynamicMessage.fields);
            mergeUnknownFields(dynamicMessage.unknownFields);
            return this;
        }

        public DynamicMessage build() {
            if (this.fields == null || isInitialized()) {
                return buildPartial();
            }
            throw newUninitializedMessageException(new DynamicMessage(this.type, this.fields, this.unknownFields));
        }

        /* access modifiers changed from: private */
        public DynamicMessage buildParsed() throws InvalidProtocolBufferException {
            if (isInitialized()) {
                return buildPartial();
            }
            throw newUninitializedMessageException(new DynamicMessage(this.type, this.fields, this.unknownFields)).asInvalidProtocolBufferException();
        }

        public DynamicMessage buildPartial() {
            if (this.fields == null) {
                throw new IllegalStateException("build() has already been called on this Builder.");
            }
            this.fields.makeImmutable();
            DynamicMessage dynamicMessage = new DynamicMessage(this.type, this.fields, this.unknownFields);
            this.fields = null;
            this.unknownFields = null;
            return dynamicMessage;
        }

        public Builder clone() {
            Builder builder = new Builder(this.type);
            builder.fields.mergeFrom(this.fields);
            return builder;
        }

        public boolean isInitialized() {
            return DynamicMessage.isInitialized(this.type, this.fields);
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return this.type;
        }

        public DynamicMessage getDefaultInstanceForType() {
            return DynamicMessage.getDefaultInstance(this.type);
        }

        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            return this.fields.getAllFields();
        }

        public Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            verifyContainingType(fieldDescriptor);
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                return new Builder(fieldDescriptor.getMessageType());
            }
            throw new IllegalArgumentException("newBuilderForField is only valid for fields with message type.");
        }

        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            verifyContainingType(fieldDescriptor);
            return this.fields.hasField(fieldDescriptor);
        }

        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            verifyContainingType(fieldDescriptor);
            Object field = this.fields.getField(fieldDescriptor);
            if (field != null) {
                return field;
            }
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                return DynamicMessage.getDefaultInstance(fieldDescriptor.getMessageType());
            }
            return fieldDescriptor.getDefaultValue();
        }

        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            verifyContainingType(fieldDescriptor);
            this.fields.setField(fieldDescriptor, obj);
            return this;
        }

        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            verifyContainingType(fieldDescriptor);
            this.fields.clearField(fieldDescriptor);
            return this;
        }

        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            verifyContainingType(fieldDescriptor);
            return this.fields.getRepeatedFieldCount(fieldDescriptor);
        }

        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            verifyContainingType(fieldDescriptor);
            return this.fields.getRepeatedField(fieldDescriptor, i);
        }

        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            verifyContainingType(fieldDescriptor);
            this.fields.setRepeatedField(fieldDescriptor, i, obj);
            return this;
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            verifyContainingType(fieldDescriptor);
            this.fields.addRepeatedField(fieldDescriptor, obj);
            return this;
        }

        public UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        public Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            this.unknownFields = unknownFieldSet;
            return this;
        }

        public Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            this.unknownFields = UnknownFieldSet.newBuilder(this.unknownFields).mergeFrom(unknownFieldSet).build();
            return this;
        }

        private void verifyContainingType(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != this.type) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }
    }
}
