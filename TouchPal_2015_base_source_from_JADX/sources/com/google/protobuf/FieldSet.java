package com.google.protobuf;

import com.google.protobuf.FieldSet.FieldDescriptorLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class FieldSet<FieldDescriptorType extends FieldDescriptorLite<FieldDescriptorType>> {
    private static final FieldSet DEFAULT_INSTANCE = new FieldSet(true);
    private final SmallSortedMap<FieldDescriptorType, Object> fields = SmallSortedMap.newFieldMap(16);
    private boolean isImmutable;

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        Internal.EnumLiteMap<?> getEnumType();

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    private FieldSet() {
    }

    private FieldSet(boolean z) {
        makeImmutable();
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> newFieldSet() {
        return new FieldSet<>();
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> emptySet() {
        return DEFAULT_INSTANCE;
    }

    public void makeImmutable() {
        if (!this.isImmutable) {
            this.fields.makeImmutable();
            this.isImmutable = true;
        }
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public FieldSet<FieldDescriptorType> clone() {
        FieldSet<FieldDescriptorType> newFieldSet = newFieldSet();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.fields.getNumArrayEntries()) {
                break;
            }
            Map.Entry<FieldDescriptorType, Object> arrayEntryAt = this.fields.getArrayEntryAt(i2);
            newFieldSet.setField((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
            i = i2 + 1;
        }
        for (Map.Entry next : this.fields.getOverflowEntries()) {
            newFieldSet.setField((FieldDescriptorLite) next.getKey(), next.getValue());
        }
        return newFieldSet;
    }

    public void clear() {
        this.fields.clear();
    }

    public Map<FieldDescriptorType, Object> getAllFields() {
        return this.fields.isImmutable() ? this.fields : Collections.unmodifiableMap(this.fields);
    }

    public Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        return this.fields.entrySet().iterator();
    }

    public boolean hasField(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.isRepeated()) {
            return this.fields.get(fielddescriptortype) != null;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    public Object getField(FieldDescriptorType fielddescriptortype) {
        return this.fields.get(fielddescriptortype);
    }

    public void setField(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.isRepeated()) {
            verifyType(fielddescriptortype.getLiteType(), obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object verifyType : arrayList) {
                verifyType(fielddescriptortype.getLiteType(), verifyType);
            }
            obj = arrayList;
        }
        this.fields.put(fielddescriptortype, obj);
    }

    public void clearField(FieldDescriptorType fielddescriptortype) {
        this.fields.remove(fielddescriptortype);
    }

    public int getRepeatedFieldCount(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj = this.fields.get(fielddescriptortype);
        if (obj == null) {
            return 0;
        }
        return ((List) obj).size();
    }

    public Object getRepeatedField(FieldDescriptorType fielddescriptortype, int i) {
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj = this.fields.get(fielddescriptortype);
        if (obj != null) {
            return ((List) obj).get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public void setRepeatedField(FieldDescriptorType fielddescriptortype, int i, Object obj) {
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj2 = this.fields.get(fielddescriptortype);
        if (obj2 == null) {
            throw new IndexOutOfBoundsException();
        }
        verifyType(fielddescriptortype.getLiteType(), obj);
        ((List) obj2).set(i, obj);
    }

    public void addRepeatedField(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        verifyType(fielddescriptortype.getLiteType(), obj);
        Object obj2 = this.fields.get(fielddescriptortype);
        if (obj2 == null) {
            list = new ArrayList();
            this.fields.put(fielddescriptortype, list);
        } else {
            list = (List) obj2;
        }
        list.add(obj);
    }

    private static void verifyType(WireFormat.FieldType fieldType, Object obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
        boolean z = false;
        switch (fieldType.getJavaType()) {
            case INT:
                z = obj instanceof Integer;
                break;
            case LONG:
                z = obj instanceof Long;
                break;
            case FLOAT:
                z = obj instanceof Float;
                break;
            case DOUBLE:
                z = obj instanceof Double;
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                break;
            case STRING:
                z = obj instanceof String;
                break;
            case BYTE_STRING:
                z = obj instanceof ByteString;
                break;
            case ENUM:
                z = obj instanceof Internal.EnumLite;
                break;
            case MESSAGE:
                z = obj instanceof MessageLite;
                break;
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public boolean isInitialized() {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            if (!isInitialized(this.fields.getArrayEntryAt(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> isInitialized : this.fields.getOverflowEntries()) {
            if (!isInitialized(isInitialized)) {
                return false;
            }
        }
        return true;
    }

    private boolean isInitialized(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (fieldDescriptorLite.isRepeated()) {
                for (MessageLite isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else if (!((MessageLite) entry.getValue()).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    static int getWireFormatForFieldType(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    public void mergeFrom(FieldSet<FieldDescriptorType> fieldSet) {
        for (int i = 0; i < fieldSet.fields.getNumArrayEntries(); i++) {
            mergeFromField(fieldSet.fields.getArrayEntryAt(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> mergeFromField : fieldSet.fields.getOverflowEntries()) {
            mergeFromField(mergeFromField);
        }
    }

    private void mergeFromField(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (fieldDescriptorLite.isRepeated()) {
            Object obj = this.fields.get(fieldDescriptorLite);
            if (obj == null) {
                this.fields.put(fieldDescriptorLite, new ArrayList((List) value));
            } else {
                ((List) obj).addAll((List) value);
            }
        } else if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            Object obj2 = this.fields.get(fieldDescriptorLite);
            if (obj2 == null) {
                this.fields.put(fieldDescriptorLite, value);
            } else {
                this.fields.put(fieldDescriptorLite, fieldDescriptorLite.internalMergeFrom(((MessageLite) obj2).toBuilder(), (MessageLite) value).build());
            }
        } else {
            this.fields.put(fieldDescriptorLite, value);
        }
    }

    public static Object readPrimitiveField(CodedInputStream codedInputStream, WireFormat.FieldType fieldType) throws IOException {
        switch (fieldType) {
            case DOUBLE:
                return Double.valueOf(codedInputStream.readDouble());
            case FLOAT:
                return Float.valueOf(codedInputStream.readFloat());
            case INT64:
                return Long.valueOf(codedInputStream.readInt64());
            case UINT64:
                return Long.valueOf(codedInputStream.readUInt64());
            case INT32:
                return Integer.valueOf(codedInputStream.readInt32());
            case FIXED64:
                return Long.valueOf(codedInputStream.readFixed64());
            case FIXED32:
                return Integer.valueOf(codedInputStream.readFixed32());
            case BOOL:
                return Boolean.valueOf(codedInputStream.readBool());
            case STRING:
                return codedInputStream.readString();
            case BYTES:
                return codedInputStream.readBytes();
            case UINT32:
                return Integer.valueOf(codedInputStream.readUInt32());
            case SFIXED32:
                return Integer.valueOf(codedInputStream.readSFixed32());
            case SFIXED64:
                return Long.valueOf(codedInputStream.readSFixed64());
            case SINT32:
                return Integer.valueOf(codedInputStream.readSInt32());
            case SINT64:
                return Long.valueOf(codedInputStream.readSInt64());
            case GROUP:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case MESSAGE:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case ENUM:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.fields.getNumArrayEntries()) {
                break;
            }
            Map.Entry<FieldDescriptorType, Object> arrayEntryAt = this.fields.getArrayEntryAt(i2);
            writeField((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue(), codedOutputStream);
            i = i2 + 1;
        }
        for (Map.Entry next : this.fields.getOverflowEntries()) {
            writeField((FieldDescriptorLite) next.getKey(), next.getValue(), codedOutputStream);
        }
    }

    public void writeMessageSetTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            writeMessageSetTo(this.fields.getArrayEntryAt(i), codedOutputStream);
        }
        for (Map.Entry<FieldDescriptorType, Object> writeMessageSetTo : this.fields.getOverflowEntries()) {
            writeMessageSetTo(writeMessageSetTo, codedOutputStream);
        }
    }

    private void writeMessageSetTo(Map.Entry<FieldDescriptorType, Object> entry, CodedOutputStream codedOutputStream) throws IOException {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
            writeField(fieldDescriptorLite, entry.getValue(), codedOutputStream);
        } else {
            codedOutputStream.writeMessageSetExtension(((FieldDescriptorLite) entry.getKey()).getNumber(), (MessageLite) entry.getValue());
        }
    }

    private static void writeElement(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (MessageLite) obj);
            return;
        }
        codedOutputStream.writeTag(i, getWireFormatForFieldType(fieldType, false));
        writeElementNoTag(codedOutputStream, fieldType, obj);
    }

    private static void writeElementNoTag(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (fieldType) {
            case DOUBLE:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                return;
            case FLOAT:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                return;
            case INT64:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                return;
            case UINT64:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                return;
            case INT32:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                return;
            case FIXED64:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                return;
            case FIXED32:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                return;
            case BOOL:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                return;
            case STRING:
                codedOutputStream.writeStringNoTag((String) obj);
                return;
            case BYTES:
                codedOutputStream.writeBytesNoTag((ByteString) obj);
                return;
            case UINT32:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                return;
            case SFIXED32:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                return;
            case SFIXED64:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                return;
            case SINT32:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                return;
            case SINT64:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                return;
            case GROUP:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                return;
            case MESSAGE:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                return;
            case ENUM:
                codedOutputStream.writeEnumNoTag(((Internal.EnumLite) obj).getNumber());
                return;
            default:
                return;
        }
    }

    public static void writeField(FieldDescriptorLite<?> fieldDescriptorLite, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            List<Object> list = (List) obj;
            if (fieldDescriptorLite.isPacked()) {
                codedOutputStream.writeTag(number, 2);
                int i = 0;
                for (Object computeElementSizeNoTag : list) {
                    i += computeElementSizeNoTag(liteType, computeElementSizeNoTag);
                }
                codedOutputStream.writeRawVarint32(i);
                for (Object writeElementNoTag : list) {
                    writeElementNoTag(codedOutputStream, liteType, writeElementNoTag);
                }
                return;
            }
            for (Object writeElement : list) {
                writeElement(codedOutputStream, liteType, number, writeElement);
            }
            return;
        }
        writeElement(codedOutputStream, liteType, number, obj);
    }

    public int getSerializedSize() {
        int i = 0;
        for (int i2 = 0; i2 < this.fields.getNumArrayEntries(); i2++) {
            Map.Entry<FieldDescriptorType, Object> arrayEntryAt = this.fields.getArrayEntryAt(i2);
            i += computeFieldSize((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry next : this.fields.getOverflowEntries()) {
            i += computeFieldSize((FieldDescriptorLite) next.getKey(), next.getValue());
        }
        return i;
    }

    public int getMessageSetSerializedSize() {
        int i = 0;
        for (int i2 = 0; i2 < this.fields.getNumArrayEntries(); i2++) {
            i += getMessageSetSerializedSize(this.fields.getArrayEntryAt(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> messageSetSerializedSize : this.fields.getOverflowEntries()) {
            i += getMessageSetSerializedSize(messageSetSerializedSize);
        }
        return i;
    }

    private int getMessageSetSerializedSize(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
            return computeFieldSize(fieldDescriptorLite, entry.getValue());
        }
        return CodedOutputStream.computeMessageSetExtensionSize(((FieldDescriptorLite) entry.getKey()).getNumber(), (MessageLite) entry.getValue());
    }

    private static int computeElementSize(WireFormat.FieldType fieldType, int i, Object obj) {
        int computeTagSize = CodedOutputStream.computeTagSize(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            computeTagSize *= 2;
        }
        return computeTagSize + computeElementSizeNoTag(fieldType, obj);
    }

    private static int computeElementSizeNoTag(WireFormat.FieldType fieldType, Object obj) {
        switch (fieldType) {
            case DOUBLE:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case FLOAT:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case INT64:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case UINT64:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case INT32:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case FIXED64:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case FIXED32:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case BOOL:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case STRING:
                return CodedOutputStream.computeStringSizeNoTag((String) obj);
            case BYTES:
                return CodedOutputStream.computeBytesSizeNoTag((ByteString) obj);
            case UINT32:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case SFIXED32:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case SFIXED64:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case SINT32:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case SINT64:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case GROUP:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case MESSAGE:
                return CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case ENUM:
                return CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj).getNumber());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int computeFieldSize(FieldDescriptorLite<?> fieldDescriptorLite, Object obj) {
        int i = 0;
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            return computeElementSize(liteType, number, obj);
        }
        if (fieldDescriptorLite.isPacked()) {
            for (Object computeElementSizeNoTag : (List) obj) {
                i += computeElementSizeNoTag(liteType, computeElementSizeNoTag);
            }
            return CodedOutputStream.computeRawVarint32Size(i) + CodedOutputStream.computeTagSize(number) + i;
        }
        for (Object computeElementSize : (List) obj) {
            i += computeElementSize(liteType, number, computeElementSize);
        }
        return i;
    }
}
