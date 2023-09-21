package com.cootek.smartinput5.engine.cloke;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SearchResultProtos {
    /* access modifiers changed from: private */
    public static Descriptors.FileDescriptor descriptor;
    /* access modifiers changed from: private */
    public static Descriptors.Descriptor internal_static_cloke_SearchResult_Result_descriptor;
    /* access modifiers changed from: private */
    public static GeneratedMessage.FieldAccessorTable internal_static_cloke_SearchResult_Result_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static Descriptors.Descriptor internal_static_cloke_SearchResult_descriptor;
    /* access modifiers changed from: private */
    public static GeneratedMessage.FieldAccessorTable internal_static_cloke_SearchResult_fieldAccessorTable;

    public interface SearchResultOrBuilder extends MessageOrBuilder {
        String getReference();

        SearchResult.Result getResult(int i);

        int getResultCount();

        List<SearchResult.Result> getResultList();

        SearchResult.ResultOrBuilder getResultOrBuilder(int i);

        List<? extends SearchResult.ResultOrBuilder> getResultOrBuilderList();

        boolean hasReference();
    }

    private SearchResultProtos() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
    }

    public static final class SearchResult extends GeneratedMessage implements SearchResultOrBuilder {
        public static final int REFERENCE_FIELD_NUMBER = 1;
        public static final int RESULT_FIELD_NUMBER = 2;
        private static final SearchResult defaultInstance = new SearchResult(true);
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public Object reference_;
        /* access modifiers changed from: private */
        public List<Result> result_;

        public interface ResultOrBuilder extends MessageOrBuilder {
            String getCandidate();

            String getEvidence();

            String getTag();

            boolean hasCandidate();

            boolean hasEvidence();

            boolean hasTag();
        }

        private SearchResult(Builder builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
        }

        private SearchResult(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
        }

        public static SearchResult getDefaultInstance() {
            return defaultInstance;
        }

        public SearchResult getDefaultInstanceForType() {
            return defaultInstance;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SearchResultProtos.internal_static_cloke_SearchResult_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SearchResultProtos.internal_static_cloke_SearchResult_fieldAccessorTable;
        }

        public static final class Result extends GeneratedMessage implements ResultOrBuilder {
            public static final int CANDIDATE_FIELD_NUMBER = 1;
            public static final int EVIDENCE_FIELD_NUMBER = 2;
            public static final int TAG_FIELD_NUMBER = 3;
            private static final Result defaultInstance = new Result(true);
            private static final long serialVersionUID = 0;
            /* access modifiers changed from: private */
            public int bitField0_;
            /* access modifiers changed from: private */
            public Object candidate_;
            /* access modifiers changed from: private */
            public Object evidence_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            /* access modifiers changed from: private */
            public Object tag_;

            private Result(Builder builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
            }

            private Result(boolean z) {
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
            }

            public static Result getDefaultInstance() {
                return defaultInstance;
            }

            public Result getDefaultInstanceForType() {
                return defaultInstance;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SearchResultProtos.internal_static_cloke_SearchResult_Result_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SearchResultProtos.internal_static_cloke_SearchResult_Result_fieldAccessorTable;
            }

            public boolean hasCandidate() {
                return (this.bitField0_ & 1) == 1;
            }

            public String getCandidate() {
                Object obj = this.candidate_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (Internal.isValidUtf8(byteString)) {
                    this.candidate_ = stringUtf8;
                }
                return stringUtf8;
            }

            private ByteString getCandidateBytes() {
                Object obj = this.candidate_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.candidate_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public boolean hasEvidence() {
                return (this.bitField0_ & 2) == 2;
            }

            public String getEvidence() {
                Object obj = this.evidence_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (Internal.isValidUtf8(byteString)) {
                    this.evidence_ = stringUtf8;
                }
                return stringUtf8;
            }

            private ByteString getEvidenceBytes() {
                Object obj = this.evidence_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.evidence_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public boolean hasTag() {
                return (this.bitField0_ & 4) == 4;
            }

            public String getTag() {
                Object obj = this.tag_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (Internal.isValidUtf8(byteString)) {
                    this.tag_ = stringUtf8;
                }
                return stringUtf8;
            }

            private ByteString getTagBytes() {
                Object obj = this.tag_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.tag_ = copyFromUtf8;
                return copyFromUtf8;
            }

            private void initFields() {
                this.candidate_ = "";
                this.evidence_ = "";
                this.tag_ = "";
            }

            public final boolean isInitialized() {
                boolean z = true;
                byte b = this.memoizedIsInitialized;
                if (b != -1) {
                    if (b != 1) {
                        z = false;
                    }
                    return z;
                } else if (!hasCandidate()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                } else if (!hasEvidence()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                } else if (!hasTag()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                } else {
                    this.memoizedIsInitialized = 1;
                    return true;
                }
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeBytes(1, getCandidateBytes());
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.writeBytes(2, getEvidenceBytes());
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.writeBytes(3, getTagBytes());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public int getSerializedSize() {
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                if ((this.bitField0_ & 1) == 1) {
                    i2 = 0 + CodedOutputStream.computeBytesSize(1, getCandidateBytes());
                }
                if ((this.bitField0_ & 2) == 2) {
                    i2 += CodedOutputStream.computeBytesSize(2, getEvidenceBytes());
                }
                if ((this.bitField0_ & 4) == 4) {
                    i2 += CodedOutputStream.computeBytesSize(3, getTagBytes());
                }
                int serializedSize = i2 + getUnknownFields().getSerializedSize();
                this.memoizedSerializedSize = serializedSize;
                return serializedSize;
            }

            /* access modifiers changed from: protected */
            public Object writeReplace() throws ObjectStreamException {
                return super.writeReplace();
            }

            public static Result parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return ((Builder) newBuilder().mergeFrom(byteString)).buildParsed();
            }

            public static Result parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return ((Builder) newBuilder().mergeFrom(byteString, extensionRegistryLite)).buildParsed();
            }

            public static Result parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return ((Builder) newBuilder().mergeFrom(bArr)).buildParsed();
            }

            public static Result parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return ((Builder) newBuilder().mergeFrom(bArr, extensionRegistryLite)).buildParsed();
            }

            public static Result parseFrom(InputStream inputStream) throws IOException {
                return ((Builder) newBuilder().mergeFrom(inputStream)).buildParsed();
            }

            public static Result parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return ((Builder) newBuilder().mergeFrom(inputStream, extensionRegistryLite)).buildParsed();
            }

            public static Result parseDelimitedFrom(InputStream inputStream) throws IOException {
                Builder newBuilder = newBuilder();
                if (newBuilder.mergeDelimitedFrom(inputStream)) {
                    return newBuilder.buildParsed();
                }
                return null;
            }

            public static Result parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Builder newBuilder = newBuilder();
                if (newBuilder.mergeDelimitedFrom(inputStream, extensionRegistryLite)) {
                    return newBuilder.buildParsed();
                }
                return null;
            }

            public static Result parseFrom(CodedInputStream codedInputStream) throws IOException {
                return ((Builder) newBuilder().mergeFrom(codedInputStream)).buildParsed();
            }

            public static Result parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return newBuilder().mergeFrom(codedInputStream, extensionRegistryLite).buildParsed();
            }

            public static Builder newBuilder() {
                return Builder.create();
            }

            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder(Result result) {
                return newBuilder().mergeFrom(result);
            }

            public Builder toBuilder() {
                return newBuilder(this);
            }

            /* access modifiers changed from: protected */
            public Builder newBuilderForType(GeneratedMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements ResultOrBuilder {
                private int bitField0_;
                private Object candidate_;
                private Object evidence_;
                private Object tag_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return SearchResultProtos.internal_static_cloke_SearchResult_Result_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SearchResultProtos.internal_static_cloke_SearchResult_Result_fieldAccessorTable;
                }

                private Builder() {
                    this.candidate_ = "";
                    this.evidence_ = "";
                    this.tag_ = "";
                    maybeForceBuilderInitialization();
                }

                private Builder(GeneratedMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.candidate_ = "";
                    this.evidence_ = "";
                    this.tag_ = "";
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (Result.alwaysUseFieldBuilders) {
                    }
                }

                /* access modifiers changed from: private */
                public static Builder create() {
                    return new Builder();
                }

                public Builder clear() {
                    super.clear();
                    this.candidate_ = "";
                    this.bitField0_ &= -2;
                    this.evidence_ = "";
                    this.bitField0_ &= -3;
                    this.tag_ = "";
                    this.bitField0_ &= -5;
                    return this;
                }

                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }

                public Descriptors.Descriptor getDescriptorForType() {
                    return Result.getDescriptor();
                }

                public Result getDefaultInstanceForType() {
                    return Result.getDefaultInstance();
                }

                public Result build() {
                    Result buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                /* access modifiers changed from: private */
                public Result buildParsed() throws InvalidProtocolBufferException {
                    Result buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial).asInvalidProtocolBufferException();
                }

                public Result buildPartial() {
                    int i = 1;
                    Result result = new Result(this);
                    int i2 = this.bitField0_;
                    if ((i2 & 1) != 1) {
                        i = 0;
                    }
                    Object unused = result.candidate_ = this.candidate_;
                    if ((i2 & 2) == 2) {
                        i |= 2;
                    }
                    Object unused2 = result.evidence_ = this.evidence_;
                    if ((i2 & 4) == 4) {
                        i |= 4;
                    }
                    Object unused3 = result.tag_ = this.tag_;
                    int unused4 = result.bitField0_ = i;
                    onBuilt();
                    return result;
                }

                public Builder mergeFrom(Message message) {
                    if (message instanceof Result) {
                        return mergeFrom((Result) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Result result) {
                    if (result != Result.getDefaultInstance()) {
                        if (result.hasCandidate()) {
                            setCandidate(result.getCandidate());
                        }
                        if (result.hasEvidence()) {
                            setEvidence(result.getEvidence());
                        }
                        if (result.hasTag()) {
                            setTag(result.getTag());
                        }
                        mergeUnknownFields(result.getUnknownFields());
                    }
                    return this;
                }

                public final boolean isInitialized() {
                    if (hasCandidate() && hasEvidence() && hasTag()) {
                        return true;
                    }
                    return false;
                }

                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder(getUnknownFields());
                    while (true) {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                setUnknownFields(newBuilder.build());
                                onChanged();
                                break;
                            case 10:
                                this.bitField0_ |= 1;
                                this.candidate_ = codedInputStream.readBytes();
                                continue;
                            case 18:
                                this.bitField0_ |= 2;
                                this.evidence_ = codedInputStream.readBytes();
                                continue;
                            case 26:
                                this.bitField0_ |= 4;
                                this.tag_ = codedInputStream.readBytes();
                                continue;
                            default:
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    setUnknownFields(newBuilder.build());
                                    onChanged();
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                    return this;
                }

                public boolean hasCandidate() {
                    return (this.bitField0_ & 1) == 1;
                }

                public String getCandidate() {
                    Object obj = this.candidate_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.candidate_ = stringUtf8;
                    return stringUtf8;
                }

                public Builder setCandidate(String str) {
                    if (str == null) {
                        throw new NullPointerException();
                    }
                    this.bitField0_ |= 1;
                    this.candidate_ = str;
                    onChanged();
                    return this;
                }

                public Builder clearCandidate() {
                    this.bitField0_ &= -2;
                    this.candidate_ = Result.getDefaultInstance().getCandidate();
                    onChanged();
                    return this;
                }

                /* access modifiers changed from: package-private */
                public void setCandidate(ByteString byteString) {
                    this.bitField0_ |= 1;
                    this.candidate_ = byteString;
                    onChanged();
                }

                public boolean hasEvidence() {
                    return (this.bitField0_ & 2) == 2;
                }

                public String getEvidence() {
                    Object obj = this.evidence_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.evidence_ = stringUtf8;
                    return stringUtf8;
                }

                public Builder setEvidence(String str) {
                    if (str == null) {
                        throw new NullPointerException();
                    }
                    this.bitField0_ |= 2;
                    this.evidence_ = str;
                    onChanged();
                    return this;
                }

                public Builder clearEvidence() {
                    this.bitField0_ &= -3;
                    this.evidence_ = Result.getDefaultInstance().getEvidence();
                    onChanged();
                    return this;
                }

                /* access modifiers changed from: package-private */
                public void setEvidence(ByteString byteString) {
                    this.bitField0_ |= 2;
                    this.evidence_ = byteString;
                    onChanged();
                }

                public boolean hasTag() {
                    return (this.bitField0_ & 4) == 4;
                }

                public String getTag() {
                    Object obj = this.tag_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.tag_ = stringUtf8;
                    return stringUtf8;
                }

                public Builder setTag(String str) {
                    if (str == null) {
                        throw new NullPointerException();
                    }
                    this.bitField0_ |= 4;
                    this.tag_ = str;
                    onChanged();
                    return this;
                }

                public Builder clearTag() {
                    this.bitField0_ &= -5;
                    this.tag_ = Result.getDefaultInstance().getTag();
                    onChanged();
                    return this;
                }

                /* access modifiers changed from: package-private */
                public void setTag(ByteString byteString) {
                    this.bitField0_ |= 4;
                    this.tag_ = byteString;
                    onChanged();
                }
            }

            static {
                defaultInstance.initFields();
            }
        }

        public boolean hasReference() {
            return (this.bitField0_ & 1) == 1;
        }

        public String getReference() {
            Object obj = this.reference_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (Internal.isValidUtf8(byteString)) {
                this.reference_ = stringUtf8;
            }
            return stringUtf8;
        }

        private ByteString getReferenceBytes() {
            Object obj = this.reference_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.reference_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public List<Result> getResultList() {
            return this.result_;
        }

        public List<? extends ResultOrBuilder> getResultOrBuilderList() {
            return this.result_;
        }

        public int getResultCount() {
            return this.result_.size();
        }

        public Result getResult(int i) {
            return this.result_.get(i);
        }

        public ResultOrBuilder getResultOrBuilder(int i) {
            return this.result_.get(i);
        }

        private void initFields() {
            this.reference_ = "";
            this.result_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b != -1) {
                if (b == 1) {
                    return true;
                }
                return false;
            } else if (!hasReference()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else {
                for (int i = 0; i < getResultCount(); i++) {
                    if (!getResult(i).isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    }
                }
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBytes(1, getReferenceBytes());
            }
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.result_.size()) {
                    codedOutputStream.writeMessage(2, this.result_.get(i2));
                    i = i2 + 1;
                } else {
                    getUnknownFields().writeTo(codedOutputStream);
                    return;
                }
            }
        }

        public int getSerializedSize() {
            int i;
            int i2 = 0;
            int i3 = this.memoizedSerializedSize;
            if (i3 != -1) {
                return i3;
            }
            if ((this.bitField0_ & 1) == 1) {
                i = CodedOutputStream.computeBytesSize(1, getReferenceBytes()) + 0;
            } else {
                i = 0;
            }
            while (true) {
                int i4 = i;
                if (i2 < this.result_.size()) {
                    i = CodedOutputStream.computeMessageSize(2, this.result_.get(i2)) + i4;
                    i2++;
                } else {
                    int serializedSize = getUnknownFields().getSerializedSize() + i4;
                    this.memoizedSerializedSize = serializedSize;
                    return serializedSize;
                }
            }
        }

        /* access modifiers changed from: protected */
        public Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static SearchResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return ((Builder) newBuilder().mergeFrom(byteString)).buildParsed();
        }

        public static SearchResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return ((Builder) newBuilder().mergeFrom(byteString, extensionRegistryLite)).buildParsed();
        }

        public static SearchResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return ((Builder) newBuilder().mergeFrom(bArr)).buildParsed();
        }

        public static SearchResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return ((Builder) newBuilder().mergeFrom(bArr, extensionRegistryLite)).buildParsed();
        }

        public static SearchResult parseFrom(InputStream inputStream) throws IOException {
            return ((Builder) newBuilder().mergeFrom(inputStream)).buildParsed();
        }

        public static SearchResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return ((Builder) newBuilder().mergeFrom(inputStream, extensionRegistryLite)).buildParsed();
        }

        public static SearchResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            Builder newBuilder = newBuilder();
            if (newBuilder.mergeDelimitedFrom(inputStream)) {
                return newBuilder.buildParsed();
            }
            return null;
        }

        public static SearchResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            Builder newBuilder = newBuilder();
            if (newBuilder.mergeDelimitedFrom(inputStream, extensionRegistryLite)) {
                return newBuilder.buildParsed();
            }
            return null;
        }

        public static SearchResult parseFrom(CodedInputStream codedInputStream) throws IOException {
            return ((Builder) newBuilder().mergeFrom(codedInputStream)).buildParsed();
        }

        public static SearchResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return newBuilder().mergeFrom(codedInputStream, extensionRegistryLite).buildParsed();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(SearchResult searchResult) {
            return newBuilder().mergeFrom(searchResult);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessage.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements SearchResultOrBuilder {
            private int bitField0_;
            private Object reference_;
            private RepeatedFieldBuilder<Result, Result.Builder, ResultOrBuilder> resultBuilder_;
            private List<Result> result_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SearchResultProtos.internal_static_cloke_SearchResult_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SearchResultProtos.internal_static_cloke_SearchResult_fieldAccessorTable;
            }

            private Builder() {
                this.reference_ = "";
                this.result_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent builderParent) {
                super(builderParent);
                this.reference_ = "";
                this.result_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (SearchResult.alwaysUseFieldBuilders) {
                    getResultFieldBuilder();
                }
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.reference_ = "";
                this.bitField0_ &= -2;
                if (this.resultBuilder_ == null) {
                    this.result_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    this.resultBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return SearchResult.getDescriptor();
            }

            public SearchResult getDefaultInstanceForType() {
                return SearchResult.getDefaultInstance();
            }

            public SearchResult build() {
                SearchResult buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            /* access modifiers changed from: private */
            public SearchResult buildParsed() throws InvalidProtocolBufferException {
                SearchResult buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial).asInvalidProtocolBufferException();
            }

            public SearchResult buildPartial() {
                int i = 1;
                SearchResult searchResult = new SearchResult(this);
                if ((this.bitField0_ & 1) != 1) {
                    i = 0;
                }
                Object unused = searchResult.reference_ = this.reference_;
                if (this.resultBuilder_ == null) {
                    if ((this.bitField0_ & 2) == 2) {
                        this.result_ = Collections.unmodifiableList(this.result_);
                        this.bitField0_ &= -3;
                    }
                    List unused2 = searchResult.result_ = this.result_;
                } else {
                    List unused3 = searchResult.result_ = this.resultBuilder_.build();
                }
                int unused4 = searchResult.bitField0_ = i;
                onBuilt();
                return searchResult;
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof SearchResult) {
                    return mergeFrom((SearchResult) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SearchResult searchResult) {
                RepeatedFieldBuilder<Result, Result.Builder, ResultOrBuilder> repeatedFieldBuilder = null;
                if (searchResult != SearchResult.getDefaultInstance()) {
                    if (searchResult.hasReference()) {
                        setReference(searchResult.getReference());
                    }
                    if (this.resultBuilder_ == null) {
                        if (!searchResult.result_.isEmpty()) {
                            if (this.result_.isEmpty()) {
                                this.result_ = searchResult.result_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureResultIsMutable();
                                this.result_.addAll(searchResult.result_);
                            }
                            onChanged();
                        }
                    } else if (!searchResult.result_.isEmpty()) {
                        if (this.resultBuilder_.isEmpty()) {
                            this.resultBuilder_.dispose();
                            this.resultBuilder_ = null;
                            this.result_ = searchResult.result_;
                            this.bitField0_ &= -3;
                            if (SearchResult.alwaysUseFieldBuilders) {
                                repeatedFieldBuilder = getResultFieldBuilder();
                            }
                            this.resultBuilder_ = repeatedFieldBuilder;
                        } else {
                            this.resultBuilder_.addAllMessages(searchResult.result_);
                        }
                    }
                    mergeUnknownFields(searchResult.getUnknownFields());
                }
                return this;
            }

            public final boolean isInitialized() {
                if (!hasReference()) {
                    return false;
                }
                for (int i = 0; i < getResultCount(); i++) {
                    if (!getResult(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder(getUnknownFields());
                while (true) {
                    int readTag = codedInputStream.readTag();
                    switch (readTag) {
                        case 0:
                            setUnknownFields(newBuilder.build());
                            onChanged();
                            break;
                        case 10:
                            this.bitField0_ |= 1;
                            this.reference_ = codedInputStream.readBytes();
                            continue;
                        case 18:
                            Result.Builder newBuilder2 = Result.newBuilder();
                            codedInputStream.readMessage(newBuilder2, extensionRegistryLite);
                            addResult(newBuilder2.buildPartial());
                            continue;
                        default:
                            if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                setUnknownFields(newBuilder.build());
                                onChanged();
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                return this;
            }

            public boolean hasReference() {
                return (this.bitField0_ & 1) == 1;
            }

            public String getReference() {
                Object obj = this.reference_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.reference_ = stringUtf8;
                return stringUtf8;
            }

            public Builder setReference(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 1;
                this.reference_ = str;
                onChanged();
                return this;
            }

            public Builder clearReference() {
                this.bitField0_ &= -2;
                this.reference_ = SearchResult.getDefaultInstance().getReference();
                onChanged();
                return this;
            }

            /* access modifiers changed from: package-private */
            public void setReference(ByteString byteString) {
                this.bitField0_ |= 1;
                this.reference_ = byteString;
                onChanged();
            }

            private void ensureResultIsMutable() {
                if ((this.bitField0_ & 2) != 2) {
                    this.result_ = new ArrayList(this.result_);
                    this.bitField0_ |= 2;
                }
            }

            public List<Result> getResultList() {
                if (this.resultBuilder_ == null) {
                    return Collections.unmodifiableList(this.result_);
                }
                return this.resultBuilder_.getMessageList();
            }

            public int getResultCount() {
                if (this.resultBuilder_ == null) {
                    return this.result_.size();
                }
                return this.resultBuilder_.getCount();
            }

            public Result getResult(int i) {
                if (this.resultBuilder_ == null) {
                    return this.result_.get(i);
                }
                return this.resultBuilder_.getMessage(i);
            }

            public Builder setResult(int i, Result result) {
                if (this.resultBuilder_ != null) {
                    this.resultBuilder_.setMessage(i, result);
                } else if (result == null) {
                    throw new NullPointerException();
                } else {
                    ensureResultIsMutable();
                    this.result_.set(i, result);
                    onChanged();
                }
                return this;
            }

            public Builder setResult(int i, Result.Builder builder) {
                if (this.resultBuilder_ == null) {
                    ensureResultIsMutable();
                    this.result_.set(i, builder.build());
                    onChanged();
                } else {
                    this.resultBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addResult(Result result) {
                if (this.resultBuilder_ != null) {
                    this.resultBuilder_.addMessage(result);
                } else if (result == null) {
                    throw new NullPointerException();
                } else {
                    ensureResultIsMutable();
                    this.result_.add(result);
                    onChanged();
                }
                return this;
            }

            public Builder addResult(int i, Result result) {
                if (this.resultBuilder_ != null) {
                    this.resultBuilder_.addMessage(i, result);
                } else if (result == null) {
                    throw new NullPointerException();
                } else {
                    ensureResultIsMutable();
                    this.result_.add(i, result);
                    onChanged();
                }
                return this;
            }

            public Builder addResult(Result.Builder builder) {
                if (this.resultBuilder_ == null) {
                    ensureResultIsMutable();
                    this.result_.add(builder.build());
                    onChanged();
                } else {
                    this.resultBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public Builder addResult(int i, Result.Builder builder) {
                if (this.resultBuilder_ == null) {
                    ensureResultIsMutable();
                    this.result_.add(i, builder.build());
                    onChanged();
                } else {
                    this.resultBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllResult(Iterable<? extends Result> iterable) {
                if (this.resultBuilder_ == null) {
                    ensureResultIsMutable();
                    GeneratedMessage.Builder.addAll(iterable, this.result_);
                    onChanged();
                } else {
                    this.resultBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearResult() {
                if (this.resultBuilder_ == null) {
                    this.result_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    this.resultBuilder_.clear();
                }
                return this;
            }

            public Builder removeResult(int i) {
                if (this.resultBuilder_ == null) {
                    ensureResultIsMutable();
                    this.result_.remove(i);
                    onChanged();
                } else {
                    this.resultBuilder_.remove(i);
                }
                return this;
            }

            public Result.Builder getResultBuilder(int i) {
                return getResultFieldBuilder().getBuilder(i);
            }

            public ResultOrBuilder getResultOrBuilder(int i) {
                if (this.resultBuilder_ == null) {
                    return this.result_.get(i);
                }
                return this.resultBuilder_.getMessageOrBuilder(i);
            }

            public List<? extends ResultOrBuilder> getResultOrBuilderList() {
                if (this.resultBuilder_ != null) {
                    return this.resultBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.result_);
            }

            public Result.Builder addResultBuilder() {
                return getResultFieldBuilder().addBuilder(Result.getDefaultInstance());
            }

            public Result.Builder addResultBuilder(int i) {
                return getResultFieldBuilder().addBuilder(i, Result.getDefaultInstance());
            }

            public List<Result.Builder> getResultBuilderList() {
                return getResultFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<Result, Result.Builder, ResultOrBuilder> getResultFieldBuilder() {
                if (this.resultBuilder_ == null) {
                    this.resultBuilder_ = new RepeatedFieldBuilder<>(this.result_, (this.bitField0_ & 2) == 2, getParentForChildren(), isClean());
                    this.result_ = null;
                }
                return this.resultBuilder_;
            }
        }

        static {
            defaultInstance.initFields();
        }
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001bpbfiles/search_result.proto\u0012\u0005cloke\"\u0001\n\fSearchResult\u0012\u0011\n\treference\u0018\u0001 \u0002(\t\u0012*\n\u0006result\u0018\u0002 \u0003(\u000b2\u001a.cloke.SearchResult.Result\u001a:\n\u0006Result\u0012\u0011\n\tcandidate\u0018\u0001 \u0002(\t\u0012\u0010\n\bevidence\u0018\u0002 \u0002(\t\u0012\u000b\n\u0003tag\u0018\u0003 \u0002(\tB9\n#com.cootek.smartinput5.engine.clokeB\u0012SearchResultProtos"}, new Descriptors.FileDescriptor[0], new Descriptors.FileDescriptor.InternalDescriptorAssigner() {
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = SearchResultProtos.descriptor = fileDescriptor;
                Descriptors.Descriptor unused2 = SearchResultProtos.internal_static_cloke_SearchResult_descriptor = SearchResultProtos.getDescriptor().getMessageTypes().get(0);
                GeneratedMessage.FieldAccessorTable unused3 = SearchResultProtos.internal_static_cloke_SearchResult_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(SearchResultProtos.internal_static_cloke_SearchResult_descriptor, new String[]{"Reference", "Result"}, SearchResult.class, SearchResult.Builder.class);
                Descriptors.Descriptor unused4 = SearchResultProtos.internal_static_cloke_SearchResult_Result_descriptor = SearchResultProtos.internal_static_cloke_SearchResult_descriptor.getNestedTypes().get(0);
                GeneratedMessage.FieldAccessorTable unused5 = SearchResultProtos.internal_static_cloke_SearchResult_Result_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(SearchResultProtos.internal_static_cloke_SearchResult_Result_descriptor, new String[]{"Candidate", "Evidence", "Tag"}, SearchResult.Result.class, SearchResult.Result.Builder.class);
                return null;
            }
        });
    }
}
