package com.google.protobuf;

import com.cootek.p042a.p043a.C0911j;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.C1389aD;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.Message;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class TextFormat {
    private static final int BUFFER_SIZE = 4096;
    private static final Printer DEFAULT_PRINTER = new Printer(false);
    private static final Printer SINGLE_LINE_PRINTER = new Printer(true);

    private TextFormat() {
    }

    public static void print(Message message, Appendable appendable) throws IOException {
        DEFAULT_PRINTER.print(message, new TextGenerator(appendable));
    }

    public static void print(UnknownFieldSet unknownFieldSet, Appendable appendable) throws IOException {
        DEFAULT_PRINTER.printUnknownFields(unknownFieldSet, new TextGenerator(appendable));
    }

    public static String shortDebugString(Message message) {
        try {
            StringBuilder sb = new StringBuilder();
            SINGLE_LINE_PRINTER.print(message, new TextGenerator(sb));
            return sb.toString().trim();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public static String shortDebugString(UnknownFieldSet unknownFieldSet) {
        try {
            StringBuilder sb = new StringBuilder();
            SINGLE_LINE_PRINTER.printUnknownFields(unknownFieldSet, new TextGenerator(sb));
            return sb.toString().trim();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public static String printToString(Message message) {
        try {
            StringBuilder sb = new StringBuilder();
            print(message, (Appendable) sb);
            return sb.toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public static String printToString(UnknownFieldSet unknownFieldSet) {
        try {
            StringBuilder sb = new StringBuilder();
            print(unknownFieldSet, (Appendable) sb);
            return sb.toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void printField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
        DEFAULT_PRINTER.printField(fieldDescriptor, obj, new TextGenerator(appendable));
    }

    public static String printFieldToString(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        try {
            StringBuilder sb = new StringBuilder();
            printField(fieldDescriptor, obj, sb);
            return sb.toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void printFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
        DEFAULT_PRINTER.printFieldValue(fieldDescriptor, obj, new TextGenerator(appendable));
    }

    public static void printUnknownFieldValue(int i, Object obj, Appendable appendable) throws IOException {
        printUnknownFieldValue(i, obj, new TextGenerator(appendable));
    }

    /* access modifiers changed from: private */
    public static void printUnknownFieldValue(int i, Object obj, TextGenerator textGenerator) throws IOException {
        switch (WireFormat.getTagWireType(i)) {
            case 0:
                textGenerator.print(unsignedToString(((Long) obj).longValue()));
                return;
            case 1:
                textGenerator.print(String.format((Locale) null, "0x%016x", new Object[]{(Long) obj}));
                return;
            case 2:
                textGenerator.print("\"");
                textGenerator.print(escapeBytes((ByteString) obj));
                textGenerator.print("\"");
                return;
            case 3:
                DEFAULT_PRINTER.printUnknownFields((UnknownFieldSet) obj, textGenerator);
                return;
            case 5:
                textGenerator.print(String.format((Locale) null, "0x%08x", new Object[]{(Integer) obj}));
                return;
            default:
                throw new IllegalArgumentException("Bad tag: " + i);
        }
    }

    private static final class Printer {
        final boolean singleLineMode;

        private Printer(boolean z) {
            this.singleLineMode = z;
        }

        /* access modifiers changed from: private */
        public void print(Message message, TextGenerator textGenerator) throws IOException {
            for (Map.Entry next : message.getAllFields().entrySet()) {
                printField((Descriptors.FieldDescriptor) next.getKey(), next.getValue(), textGenerator);
            }
            printUnknownFields(message.getUnknownFields(), textGenerator);
        }

        /* access modifiers changed from: private */
        public void printField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) throws IOException {
            if (fieldDescriptor.isRepeated()) {
                for (Object printSingleField : (List) obj) {
                    printSingleField(fieldDescriptor, printSingleField, textGenerator);
                }
                return;
            }
            printSingleField(fieldDescriptor, obj, textGenerator);
        }

        private void printSingleField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) throws IOException {
            if (fieldDescriptor.isExtension()) {
                textGenerator.print("[");
                if (!fieldDescriptor.getContainingType().getOptions().getMessageSetWireFormat() || fieldDescriptor.getType() != Descriptors.FieldDescriptor.Type.MESSAGE || !fieldDescriptor.isOptional() || fieldDescriptor.getExtensionScope() != fieldDescriptor.getMessageType()) {
                    textGenerator.print(fieldDescriptor.getFullName());
                } else {
                    textGenerator.print(fieldDescriptor.getMessageType().getFullName());
                }
                textGenerator.print("]");
            } else if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP) {
                textGenerator.print(fieldDescriptor.getMessageType().getName());
            } else {
                textGenerator.print(fieldDescriptor.getName());
            }
            if (fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                textGenerator.print(": ");
            } else if (this.singleLineMode) {
                textGenerator.print(" { ");
            } else {
                textGenerator.print(" {\n");
                textGenerator.indent();
            }
            printFieldValue(fieldDescriptor, obj, textGenerator);
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                if (this.singleLineMode) {
                    textGenerator.print("} ");
                    return;
                }
                textGenerator.outdent();
                textGenerator.print("}\n");
            } else if (this.singleLineMode) {
                textGenerator.print(" ");
            } else {
                textGenerator.print(C0911j.f2473c);
            }
        }

        /* access modifiers changed from: private */
        public void printFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) throws IOException {
            switch (fieldDescriptor.getType()) {
                case INT32:
                case SINT32:
                case SFIXED32:
                    textGenerator.print(((Integer) obj).toString());
                    return;
                case INT64:
                case SINT64:
                case SFIXED64:
                    textGenerator.print(((Long) obj).toString());
                    return;
                case BOOL:
                    textGenerator.print(((Boolean) obj).toString());
                    return;
                case FLOAT:
                    textGenerator.print(((Float) obj).toString());
                    return;
                case DOUBLE:
                    textGenerator.print(((Double) obj).toString());
                    return;
                case UINT32:
                case FIXED32:
                    textGenerator.print(TextFormat.unsignedToString(((Integer) obj).intValue()));
                    return;
                case UINT64:
                case FIXED64:
                    textGenerator.print(TextFormat.unsignedToString(((Long) obj).longValue()));
                    return;
                case STRING:
                    textGenerator.print("\"");
                    textGenerator.print(TextFormat.escapeText((String) obj));
                    textGenerator.print("\"");
                    return;
                case BYTES:
                    textGenerator.print("\"");
                    textGenerator.print(TextFormat.escapeBytes((ByteString) obj));
                    textGenerator.print("\"");
                    return;
                case ENUM:
                    textGenerator.print(((Descriptors.EnumValueDescriptor) obj).getName());
                    return;
                case MESSAGE:
                case GROUP:
                    print((Message) obj, textGenerator);
                    return;
                default:
                    return;
            }
        }

        /* access modifiers changed from: private */
        public void printUnknownFields(UnknownFieldSet unknownFieldSet, TextGenerator textGenerator) throws IOException {
            for (Map.Entry next : unknownFieldSet.asMap().entrySet()) {
                int intValue = ((Integer) next.getKey()).intValue();
                UnknownFieldSet.Field field = (UnknownFieldSet.Field) next.getValue();
                printUnknownField(intValue, 0, field.getVarintList(), textGenerator);
                printUnknownField(intValue, 5, field.getFixed32List(), textGenerator);
                printUnknownField(intValue, 1, field.getFixed64List(), textGenerator);
                printUnknownField(intValue, 2, field.getLengthDelimitedList(), textGenerator);
                for (UnknownFieldSet next2 : field.getGroupList()) {
                    textGenerator.print(((Integer) next.getKey()).toString());
                    if (this.singleLineMode) {
                        textGenerator.print(" { ");
                    } else {
                        textGenerator.print(" {\n");
                        textGenerator.indent();
                    }
                    printUnknownFields(next2, textGenerator);
                    if (this.singleLineMode) {
                        textGenerator.print("} ");
                    } else {
                        textGenerator.outdent();
                        textGenerator.print("}\n");
                    }
                }
            }
        }

        private void printUnknownField(int i, int i2, List<?> list, TextGenerator textGenerator) throws IOException {
            for (Object next : list) {
                textGenerator.print(String.valueOf(i));
                textGenerator.print(": ");
                TextFormat.printUnknownFieldValue(i2, (Object) next, textGenerator);
                textGenerator.print(this.singleLineMode ? " " : C0911j.f2473c);
            }
        }
    }

    /* access modifiers changed from: private */
    public static String unsignedToString(int i) {
        if (i >= 0) {
            return Integer.toString(i);
        }
        return Long.toString(((long) i) & 4294967295L);
    }

    /* access modifiers changed from: private */
    public static String unsignedToString(long j) {
        if (j >= 0) {
            return Long.toString(j);
        }
        return BigInteger.valueOf(Long.MAX_VALUE & j).setBit(63).toString();
    }

    private static final class TextGenerator {
        private boolean atStartOfLine;
        private final StringBuilder indent;
        private final Appendable output;

        private TextGenerator(Appendable appendable) {
            this.indent = new StringBuilder();
            this.atStartOfLine = true;
            this.output = appendable;
        }

        public void indent() {
            this.indent.append("  ");
        }

        public void outdent() {
            int length = this.indent.length();
            if (length == 0) {
                throw new IllegalArgumentException(" Outdent() without matching Indent().");
            }
            this.indent.delete(length - 2, length);
        }

        public void print(CharSequence charSequence) throws IOException {
            int i = 0;
            int length = charSequence.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (charSequence.charAt(i2) == 10) {
                    write(charSequence.subSequence(i, length), (i2 - i) + 1);
                    i = i2 + 1;
                    this.atStartOfLine = true;
                }
            }
            write(charSequence.subSequence(i, length), length - i);
        }

        private void write(CharSequence charSequence, int i) throws IOException {
            if (i != 0) {
                if (this.atStartOfLine) {
                    this.atStartOfLine = false;
                    this.output.append(this.indent);
                }
                this.output.append(charSequence);
            }
        }
    }

    private static final class Tokenizer {
        private static final Pattern DOUBLE_INFINITY = Pattern.compile("-?inf(inity)?", 2);
        private static final Pattern FLOAT_INFINITY = Pattern.compile("-?inf(inity)?f?", 2);
        private static final Pattern FLOAT_NAN = Pattern.compile("nanf?", 2);
        private static final Pattern TOKEN = Pattern.compile("[a-zA-Z_][0-9a-zA-Z_+-]*+|[.]?[0-9+-][0-9a-zA-Z_.+-]*+|\"([^\"\n\\\\]|\\\\.)*+(\"|\\\\?$)|'([^'\n\\\\]|\\\\.)*+('|\\\\?$)", 8);
        private static final Pattern WHITESPACE = Pattern.compile("(\\s|(#.*$))++", 8);
        private int column;
        private String currentToken;
        private int line;
        private final Matcher matcher;
        private int pos;
        private int previousColumn;
        private int previousLine;
        private final CharSequence text;

        private Tokenizer(CharSequence charSequence) {
            this.pos = 0;
            this.line = 0;
            this.column = 0;
            this.previousLine = 0;
            this.previousColumn = 0;
            this.text = charSequence;
            this.matcher = WHITESPACE.matcher(charSequence);
            skipWhitespace();
            nextToken();
        }

        public boolean atEnd() {
            return this.currentToken.length() == 0;
        }

        public void nextToken() {
            this.previousLine = this.line;
            this.previousColumn = this.column;
            while (this.pos < this.matcher.regionStart()) {
                if (this.text.charAt(this.pos) == 10) {
                    this.line++;
                    this.column = 0;
                } else {
                    this.column++;
                }
                this.pos++;
            }
            if (this.matcher.regionStart() == this.matcher.regionEnd()) {
                this.currentToken = "";
                return;
            }
            this.matcher.usePattern(TOKEN);
            if (this.matcher.lookingAt()) {
                this.currentToken = this.matcher.group();
                this.matcher.region(this.matcher.end(), this.matcher.regionEnd());
            } else {
                this.currentToken = String.valueOf(this.text.charAt(this.pos));
                this.matcher.region(this.pos + 1, this.matcher.regionEnd());
            }
            skipWhitespace();
        }

        private void skipWhitespace() {
            this.matcher.usePattern(WHITESPACE);
            if (this.matcher.lookingAt()) {
                this.matcher.region(this.matcher.end(), this.matcher.regionEnd());
            }
        }

        public boolean tryConsume(String str) {
            if (!this.currentToken.equals(str)) {
                return false;
            }
            nextToken();
            return true;
        }

        public void consume(String str) throws ParseException {
            if (!tryConsume(str)) {
                throw parseException("Expected \"" + str + "\".");
            }
        }

        public boolean lookingAtInteger() {
            if (this.currentToken.length() == 0) {
                return false;
            }
            char charAt = this.currentToken.charAt(0);
            if (('0' <= charAt && charAt <= '9') || charAt == '-' || charAt == '+') {
                return true;
            }
            return false;
        }

        public String consumeIdentifier() throws ParseException {
            for (int i = 0; i < this.currentToken.length(); i++) {
                char charAt = this.currentToken.charAt(i);
                if (('a' > charAt || charAt > 'z') && (('A' > charAt || charAt > 'Z') && !(('0' <= charAt && charAt <= '9') || charAt == '_' || charAt == '.'))) {
                    throw parseException("Expected identifier.");
                }
            }
            String str = this.currentToken;
            nextToken();
            return str;
        }

        public int consumeInt32() throws ParseException {
            try {
                int parseInt32 = TextFormat.parseInt32(this.currentToken);
                nextToken();
                return parseInt32;
            } catch (NumberFormatException e) {
                throw integerParseException(e);
            }
        }

        public int consumeUInt32() throws ParseException {
            try {
                int parseUInt32 = TextFormat.parseUInt32(this.currentToken);
                nextToken();
                return parseUInt32;
            } catch (NumberFormatException e) {
                throw integerParseException(e);
            }
        }

        public long consumeInt64() throws ParseException {
            try {
                long parseInt64 = TextFormat.parseInt64(this.currentToken);
                nextToken();
                return parseInt64;
            } catch (NumberFormatException e) {
                throw integerParseException(e);
            }
        }

        public long consumeUInt64() throws ParseException {
            try {
                long parseUInt64 = TextFormat.parseUInt64(this.currentToken);
                nextToken();
                return parseUInt64;
            } catch (NumberFormatException e) {
                throw integerParseException(e);
            }
        }

        public double consumeDouble() throws ParseException {
            if (DOUBLE_INFINITY.matcher(this.currentToken).matches()) {
                boolean startsWith = this.currentToken.startsWith(C1351J.f4161f);
                nextToken();
                return startsWith ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
            } else if (this.currentToken.equalsIgnoreCase("nan")) {
                nextToken();
                return Double.NaN;
            } else {
                try {
                    double parseDouble = Double.parseDouble(this.currentToken);
                    nextToken();
                    return parseDouble;
                } catch (NumberFormatException e) {
                    throw floatParseException(e);
                }
            }
        }

        public float consumeFloat() throws ParseException {
            if (FLOAT_INFINITY.matcher(this.currentToken).matches()) {
                boolean startsWith = this.currentToken.startsWith(C1351J.f4161f);
                nextToken();
                return startsWith ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
            } else if (FLOAT_NAN.matcher(this.currentToken).matches()) {
                nextToken();
                return Float.NaN;
            } else {
                try {
                    float parseFloat = Float.parseFloat(this.currentToken);
                    nextToken();
                    return parseFloat;
                } catch (NumberFormatException e) {
                    throw floatParseException(e);
                }
            }
        }

        public boolean consumeBoolean() throws ParseException {
            if (this.currentToken.equals("true") || this.currentToken.equals("t") || this.currentToken.equals("1")) {
                nextToken();
                return true;
            } else if (this.currentToken.equals("false") || this.currentToken.equals("f") || this.currentToken.equals("0")) {
                nextToken();
                return false;
            } else {
                throw parseException("Expected \"true\" or \"false\".");
            }
        }

        public String consumeString() throws ParseException {
            return consumeByteString().toStringUtf8();
        }

        public ByteString consumeByteString() throws ParseException {
            ArrayList arrayList = new ArrayList();
            consumeByteString(arrayList);
            while (true) {
                if (!this.currentToken.startsWith("'") && !this.currentToken.startsWith("\"")) {
                    return ByteString.copyFrom((List<ByteString>) arrayList);
                }
                consumeByteString(arrayList);
            }
        }

        private void consumeByteString(List<ByteString> list) throws ParseException {
            char c = 0;
            if (this.currentToken.length() > 0) {
                c = this.currentToken.charAt(0);
            }
            if (c != '\"' && c != '\'') {
                throw parseException("Expected string.");
            } else if (this.currentToken.length() < 2 || this.currentToken.charAt(this.currentToken.length() - 1) != c) {
                throw parseException("String missing ending quote.");
            } else {
                try {
                    ByteString unescapeBytes = TextFormat.unescapeBytes(this.currentToken.substring(1, this.currentToken.length() - 1));
                    nextToken();
                    list.add(unescapeBytes);
                } catch (InvalidEscapeSequenceException e) {
                    throw parseException(e.getMessage());
                }
            }
        }

        public ParseException parseException(String str) {
            return new ParseException((this.line + 1) + ":" + (this.column + 1) + ": " + str);
        }

        public ParseException parseExceptionPreviousToken(String str) {
            return new ParseException((this.previousLine + 1) + ":" + (this.previousColumn + 1) + ": " + str);
        }

        private ParseException integerParseException(NumberFormatException numberFormatException) {
            return parseException("Couldn't parse integer: " + numberFormatException.getMessage());
        }

        private ParseException floatParseException(NumberFormatException numberFormatException) {
            return parseException("Couldn't parse number: " + numberFormatException.getMessage());
        }
    }

    public static class ParseException extends IOException {
        private static final long serialVersionUID = 3196188060225107702L;

        public ParseException(String str) {
            super(str);
        }
    }

    public static void merge(Readable readable, Message.Builder builder) throws IOException {
        merge(readable, ExtensionRegistry.getEmptyRegistry(), builder);
    }

    public static void merge(CharSequence charSequence, Message.Builder builder) throws ParseException {
        merge(charSequence, ExtensionRegistry.getEmptyRegistry(), builder);
    }

    public static void merge(Readable readable, ExtensionRegistry extensionRegistry, Message.Builder builder) throws IOException {
        merge((CharSequence) toStringBuilder(readable), extensionRegistry, builder);
    }

    private static StringBuilder toStringBuilder(Readable readable) throws IOException {
        StringBuilder sb = new StringBuilder();
        CharBuffer allocate = CharBuffer.allocate(4096);
        while (true) {
            int read = readable.read(allocate);
            if (read == -1) {
                return sb;
            }
            allocate.flip();
            sb.append(allocate, 0, read);
        }
    }

    public static void merge(CharSequence charSequence, ExtensionRegistry extensionRegistry, Message.Builder builder) throws ParseException {
        Tokenizer tokenizer = new Tokenizer(charSequence);
        while (!tokenizer.atEnd()) {
            mergeField(tokenizer, extensionRegistry, builder);
        }
    }

    private static void mergeField(Tokenizer tokenizer, ExtensionRegistry extensionRegistry, Message.Builder builder) throws ParseException {
        Descriptors.FieldDescriptor fieldDescriptor;
        ExtensionRegistry.ExtensionInfo extensionInfo;
        String str;
        Message.Builder builder2;
        Object obj = null;
        Descriptors.Descriptor descriptorForType = builder.getDescriptorForType();
        if (tokenizer.tryConsume("[")) {
            StringBuilder sb = new StringBuilder(tokenizer.consumeIdentifier());
            while (tokenizer.tryConsume(C1389aD.f4374j)) {
                sb.append('.');
                sb.append(tokenizer.consumeIdentifier());
            }
            extensionInfo = extensionRegistry.findExtensionByName(sb.toString());
            if (extensionInfo == null) {
                throw tokenizer.parseExceptionPreviousToken("Extension \"" + sb + "\" not found in the ExtensionRegistry.");
            } else if (extensionInfo.descriptor.getContainingType() != descriptorForType) {
                throw tokenizer.parseExceptionPreviousToken("Extension \"" + sb + "\" does not extend message type \"" + descriptorForType.getFullName() + "\".");
            } else {
                tokenizer.consume("]");
                fieldDescriptor = extensionInfo.descriptor;
            }
        } else {
            String consumeIdentifier = tokenizer.consumeIdentifier();
            Descriptors.FieldDescriptor findFieldByName = descriptorForType.findFieldByName(consumeIdentifier);
            if (!(findFieldByName != null || (findFieldByName = descriptorForType.findFieldByName(consumeIdentifier.toLowerCase(Locale.US))) == null || findFieldByName.getType() == Descriptors.FieldDescriptor.Type.GROUP)) {
                findFieldByName = null;
            }
            if (findFieldByName != null && findFieldByName.getType() == Descriptors.FieldDescriptor.Type.GROUP && !findFieldByName.getMessageType().getName().equals(consumeIdentifier)) {
                findFieldByName = null;
            }
            if (findFieldByName == null) {
                throw tokenizer.parseExceptionPreviousToken("Message type \"" + descriptorForType.getFullName() + "\" has no field named \"" + consumeIdentifier + "\".");
            }
            fieldDescriptor = findFieldByName;
            extensionInfo = null;
        }
        if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            tokenizer.tryConsume(":");
            if (tokenizer.tryConsume("<")) {
                str = ">";
            } else {
                tokenizer.consume("{");
                str = "}";
            }
            if (extensionInfo == null) {
                builder2 = builder.newBuilderForField(fieldDescriptor);
            } else {
                builder2 = extensionInfo.defaultInstance.newBuilderForType();
            }
            while (!tokenizer.tryConsume(str)) {
                if (tokenizer.atEnd()) {
                    throw tokenizer.parseException("Expected \"" + str + "\".");
                }
                mergeField(tokenizer, extensionRegistry, builder2);
            }
            obj = builder2.build();
        } else {
            tokenizer.consume(":");
            switch (fieldDescriptor.getType()) {
                case INT32:
                case SINT32:
                case SFIXED32:
                    obj = Integer.valueOf(tokenizer.consumeInt32());
                    break;
                case INT64:
                case SINT64:
                case SFIXED64:
                    obj = Long.valueOf(tokenizer.consumeInt64());
                    break;
                case BOOL:
                    obj = Boolean.valueOf(tokenizer.consumeBoolean());
                    break;
                case FLOAT:
                    obj = Float.valueOf(tokenizer.consumeFloat());
                    break;
                case DOUBLE:
                    obj = Double.valueOf(tokenizer.consumeDouble());
                    break;
                case UINT32:
                case FIXED32:
                    obj = Integer.valueOf(tokenizer.consumeUInt32());
                    break;
                case UINT64:
                case FIXED64:
                    obj = Long.valueOf(tokenizer.consumeUInt64());
                    break;
                case STRING:
                    obj = tokenizer.consumeString();
                    break;
                case BYTES:
                    obj = tokenizer.consumeByteString();
                    break;
                case ENUM:
                    Descriptors.EnumDescriptor enumType = fieldDescriptor.getEnumType();
                    if (tokenizer.lookingAtInteger()) {
                        int consumeInt32 = tokenizer.consumeInt32();
                        obj = enumType.findValueByNumber(consumeInt32);
                        if (obj == null) {
                            throw tokenizer.parseExceptionPreviousToken("Enum type \"" + enumType.getFullName() + "\" has no value with number " + consumeInt32 + '.');
                        }
                    } else {
                        String consumeIdentifier2 = tokenizer.consumeIdentifier();
                        obj = enumType.findValueByName(consumeIdentifier2);
                        if (obj == null) {
                            throw tokenizer.parseExceptionPreviousToken("Enum type \"" + enumType.getFullName() + "\" has no value named \"" + consumeIdentifier2 + "\".");
                        }
                    }
                    break;
                case MESSAGE:
                case GROUP:
                    throw new RuntimeException("Can't get here.");
            }
        }
        if (fieldDescriptor.isRepeated()) {
            builder.addRepeatedField(fieldDescriptor, obj);
        } else {
            builder.setField(fieldDescriptor, obj);
        }
    }

    static String escapeBytes(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i = 0; i < byteString.size(); i++) {
            byte byteAt = byteString.byteAt(i);
            switch (byteAt) {
                case 7:
                    sb.append("\\a");
                    break;
                case 8:
                    sb.append("\\b");
                    break;
                case 9:
                    sb.append("\\t");
                    break;
                case 10:
                    sb.append("\\n");
                    break;
                case 11:
                    sb.append("\\v");
                    break;
                case 12:
                    sb.append("\\f");
                    break;
                case 13:
                    sb.append("\\r");
                    break;
                case Settings.STATISTIC_ENABLED:
                    sb.append("\\\"");
                    break;
                case Settings.TOUCH_CORRECT:
                    sb.append("\\'");
                    break;
                case Settings.PRODUCT_ACTIVATION_CODE:
                    sb.append("\\\\");
                    break;
                default:
                    if (byteAt < 32) {
                        sb.append('\\');
                        sb.append((char) (((byteAt >>> 6) & 3) + 48));
                        sb.append((char) (((byteAt >>> 3) & 7) + 48));
                        sb.append((char) ((byteAt & 7) + 48));
                        break;
                    } else {
                        sb.append((char) byteAt);
                        break;
                    }
            }
        }
        return sb.toString();
    }

    static ByteString unescapeBytes(CharSequence charSequence) throws InvalidEscapeSequenceException {
        int i;
        int i2;
        ByteString copyFromUtf8 = ByteString.copyFromUtf8(charSequence.toString());
        byte[] bArr = new byte[copyFromUtf8.size()];
        int i3 = 0;
        for (int i4 = 0; i4 < copyFromUtf8.size(); i4 = i + 1) {
            byte byteAt = copyFromUtf8.byteAt(i4);
            if (byteAt != 92) {
                bArr[i3] = byteAt;
                i3++;
                i = i4;
            } else if (i4 + 1 < copyFromUtf8.size()) {
                i = i4 + 1;
                byte byteAt2 = copyFromUtf8.byteAt(i);
                if (isOctal(byteAt2)) {
                    int digitValue = digitValue(byteAt2);
                    if (i + 1 < copyFromUtf8.size() && isOctal(copyFromUtf8.byteAt(i + 1))) {
                        i++;
                        digitValue = (digitValue * 8) + digitValue(copyFromUtf8.byteAt(i));
                    }
                    if (i + 1 < copyFromUtf8.size() && isOctal(copyFromUtf8.byteAt(i + 1))) {
                        i++;
                        digitValue = (digitValue * 8) + digitValue(copyFromUtf8.byteAt(i));
                    }
                    bArr[i3] = (byte) digitValue;
                    i3++;
                } else {
                    switch (byteAt2) {
                        case Settings.STATISTIC_ENABLED:
                            i2 = i3 + 1;
                            bArr[i3] = 34;
                            break;
                        case Settings.TOUCH_CORRECT:
                            i2 = i3 + 1;
                            bArr[i3] = 39;
                            break;
                        case Settings.PRODUCT_ACTIVATION_CODE:
                            i2 = i3 + 1;
                            bArr[i3] = 92;
                            break;
                        case Settings.LBS_NOTIFIED_LOCATION:
                            i2 = i3 + 1;
                            bArr[i3] = 7;
                            break;
                        case Settings.LBS_NOTIFIED_LOCATION_CLEAR_TIME:
                            i2 = i3 + 1;
                            bArr[i3] = 8;
                            break;
                        case 102:
                            i2 = i3 + 1;
                            bArr[i3] = 12;
                            break;
                        case 110:
                            i2 = i3 + 1;
                            bArr[i3] = 10;
                            break;
                        case 114:
                            i2 = i3 + 1;
                            bArr[i3] = 13;
                            break;
                        case 116:
                            i2 = i3 + 1;
                            bArr[i3] = 9;
                            break;
                        case Settings.FIRST_CHS_MORE:
                            i2 = i3 + 1;
                            bArr[i3] = 11;
                            break;
                        case 120:
                            if (i + 1 < copyFromUtf8.size() && isHex(copyFromUtf8.byteAt(i + 1))) {
                                i++;
                                int digitValue2 = digitValue(copyFromUtf8.byteAt(i));
                                if (i + 1 < copyFromUtf8.size() && isHex(copyFromUtf8.byteAt(i + 1))) {
                                    i++;
                                    digitValue2 = (digitValue2 * 16) + digitValue(copyFromUtf8.byteAt(i));
                                }
                                bArr[i3] = (byte) digitValue2;
                                i2 = i3 + 1;
                                break;
                            } else {
                                throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\x' with no digits");
                            }
                        default:
                            throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\" + ((char) byteAt2) + '\'');
                    }
                    i3 = i2;
                }
            } else {
                throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\' at end of string.");
            }
        }
        return ByteString.copyFrom(bArr, 0, i3);
    }

    static class InvalidEscapeSequenceException extends IOException {
        private static final long serialVersionUID = -8164033650142593304L;

        InvalidEscapeSequenceException(String str) {
            super(str);
        }
    }

    static String escapeText(String str) {
        return escapeBytes(ByteString.copyFromUtf8(str));
    }

    static String unescapeText(String str) throws InvalidEscapeSequenceException {
        return unescapeBytes(str).toStringUtf8();
    }

    private static boolean isOctal(byte b) {
        return 48 <= b && b <= 55;
    }

    private static boolean isHex(byte b) {
        return (48 <= b && b <= 57) || (97 <= b && b <= 102) || (65 <= b && b <= 70);
    }

    private static int digitValue(byte b) {
        if (48 <= b && b <= 57) {
            return b - 48;
        }
        if (97 > b || b > 122) {
            return (b - 65) + 10;
        }
        return (b - 97) + 10;
    }

    static int parseInt32(String str) throws NumberFormatException {
        return (int) parseInteger(str, true, false);
    }

    static int parseUInt32(String str) throws NumberFormatException {
        return (int) parseInteger(str, false, false);
    }

    static long parseInt64(String str) throws NumberFormatException {
        return parseInteger(str, true, true);
    }

    static long parseUInt64(String str) throws NumberFormatException {
        return parseInteger(str, false, true);
    }

    private static long parseInteger(String str, boolean z, boolean z2) throws NumberFormatException {
        int i;
        int i2;
        BigInteger bigInteger;
        long j;
        boolean z3 = true;
        int i3 = 0;
        if (!str.startsWith(C1351J.f4161f, 0)) {
            z3 = false;
        } else if (!z) {
            throw new NumberFormatException("Number must be positive: " + str);
        } else {
            i3 = 1;
        }
        if (str.startsWith("0x", i3)) {
            i = i3 + 2;
            i2 = 16;
        } else if (str.startsWith("0", i3)) {
            i = i3;
            i2 = 8;
        } else {
            i = i3;
            i2 = 10;
        }
        String substring = str.substring(i);
        if (substring.length() < 16) {
            long parseLong = Long.parseLong(substring, i2);
            if (z3) {
                j = -parseLong;
            } else {
                j = parseLong;
            }
            if (z2) {
                return j;
            }
            if (z) {
                if (j <= 2147483647L && j >= -2147483648L) {
                    return j;
                }
                throw new NumberFormatException("Number out of range for 32-bit signed integer: " + str);
            } else if (j < 4294967296L && j >= 0) {
                return j;
            } else {
                throw new NumberFormatException("Number out of range for 32-bit unsigned integer: " + str);
            }
        } else {
            BigInteger bigInteger2 = new BigInteger(substring, i2);
            if (z3) {
                bigInteger = bigInteger2.negate();
            } else {
                bigInteger = bigInteger2;
            }
            if (!z2) {
                if (z) {
                    if (bigInteger.bitLength() > 31) {
                        throw new NumberFormatException("Number out of range for 32-bit signed integer: " + str);
                    }
                } else if (bigInteger.bitLength() > 32) {
                    throw new NumberFormatException("Number out of range for 32-bit unsigned integer: " + str);
                }
            } else if (z) {
                if (bigInteger.bitLength() > 63) {
                    throw new NumberFormatException("Number out of range for 64-bit signed integer: " + str);
                }
            } else if (bigInteger.bitLength() > 64) {
                throw new NumberFormatException("Number out of range for 64-bit unsigned integer: " + str);
            }
            return bigInteger.longValue();
        }
    }
}
