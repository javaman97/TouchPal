package com.cootek.smartinput5.engine.cloke;

import com.cootek.smartinput5.engine.Settings;
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
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ArcticSearchResult {
    /* access modifiers changed from: private */
    public static Descriptors.FileDescriptor descriptor;
    /* access modifiers changed from: private */

    /* renamed from: internal_static_com_cootek_smartinput5_engine_cloke_SearchResult_ResultList_Result_descriptor */
    public static Descriptors.Descriptor f4014x638969d1;
    /* access modifiers changed from: private */

    /* renamed from: internal_static_com_cootek_smartinput5_engine_cloke_SearchResult_ResultList_Result_fieldAccessorTable */
    public static GeneratedMessage.FieldAccessorTable f4015xb5e2f4f;
    /* access modifiers changed from: private */

    /* renamed from: internal_static_com_cootek_smartinput5_engine_cloke_SearchResult_ResultList_descriptor */
    public static Descriptors.Descriptor f4016xa25e4a4f;
    /* access modifiers changed from: private */

    /* renamed from: internal_static_com_cootek_smartinput5_engine_cloke_SearchResult_ResultList_fieldAccessorTable */
    public static GeneratedMessage.FieldAccessorTable f4017x1101b1cd;
    /* access modifiers changed from: private */

    /* renamed from: internal_static_com_cootek_smartinput5_engine_cloke_SearchResult_descriptor */
    public static Descriptors.Descriptor f4018x95197e53;
    /* access modifiers changed from: private */

    /* renamed from: internal_static_com_cootek_smartinput5_engine_cloke_SearchResult_fieldAccessorTable */
    public static GeneratedMessage.FieldAccessorTable f4019x505aa1d1;

    public interface SearchResultOrBuilder extends MessageOrBuilder {
        String getCommonHistory();

        SearchResult.ResultList getResultList(int i);

        int getResultListCount();

        List<SearchResult.ResultList> getResultListList();

        SearchResult.ResultListOrBuilder getResultListOrBuilder(int i);

        List<? extends SearchResult.ResultListOrBuilder> getResultListOrBuilderList();

        boolean hasCommonHistory();
    }

    private ArcticSearchResult() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
    }

    public static final class SearchResult extends GeneratedMessage implements SearchResultOrBuilder {
        public static final int COMMON_HISTORY_FIELD_NUMBER = 2;
        public static final int RESULT_LIST_FIELD_NUMBER = 1;
        private static final SearchResult defaultInstance = new SearchResult(true);
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public Object commonHistory_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<ResultList> resultList_;

        public interface ResultListOrBuilder extends MessageOrBuilder {
            String getHistory();

            ResultList.Result getResult(int i);

            int getResultCount();

            List<ResultList.Result> getResultList();

            ResultList.ResultOrBuilder getResultOrBuilder(int i);

            List<? extends ResultList.ResultOrBuilder> getResultOrBuilderList();

            boolean hasHistory();
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
            return ArcticSearchResult.f4018x95197e53;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ArcticSearchResult.f4019x505aa1d1;
        }

        public static final class ResultList extends GeneratedMessage implements ResultListOrBuilder {
            public static final int HISTORY_FIELD_NUMBER = 1;
            public static final int RESULT_FIELD_NUMBER = 2;
            private static final ResultList defaultInstance = new ResultList(true);
            private static final long serialVersionUID = 0;
            /* access modifiers changed from: private */
            public int bitField0_;
            /* access modifiers changed from: private */
            public Object history_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            /* access modifiers changed from: private */
            public List<Result> result_;

            public interface ResultOrBuilder extends MessageOrBuilder {
                String getCandidate();

                Result getDeepResult();

                ResultOrBuilder getDeepResultOrBuilder();

                String getEvidence();

                int getPriority();

                int getTag();

                boolean hasCandidate();

                boolean hasDeepResult();

                boolean hasEvidence();

                boolean hasPriority();

                boolean hasTag();
            }

            private ResultList(Builder builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
            }

            private ResultList(boolean z) {
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
            }

            public static ResultList getDefaultInstance() {
                return defaultInstance;
            }

            public ResultList getDefaultInstanceForType() {
                return defaultInstance;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ArcticSearchResult.f4016xa25e4a4f;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ArcticSearchResult.f4017x1101b1cd;
            }

            public static final class Result extends GeneratedMessage implements ResultOrBuilder {
                public static final int CANDIDATE_FIELD_NUMBER = 1;
                public static final int DEEP_RESULT_FIELD_NUMBER = 5;
                public static final int EVIDENCE_FIELD_NUMBER = 2;
                public static final int PRIORITY_FIELD_NUMBER = 4;
                public static final int TAG_FIELD_NUMBER = 3;
                private static final Result defaultInstance = new Result(true);
                private static final long serialVersionUID = 0;
                /* access modifiers changed from: private */
                public int bitField0_;
                /* access modifiers changed from: private */
                public Object candidate_;
                /* access modifiers changed from: private */
                public Result deepResult_;
                /* access modifiers changed from: private */
                public Object evidence_;
                private byte memoizedIsInitialized;
                private int memoizedSerializedSize;
                /* access modifiers changed from: private */
                public int priority_;
                /* access modifiers changed from: private */
                public int tag_;

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
                    return ArcticSearchResult.f4014x638969d1;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return ArcticSearchResult.f4015xb5e2f4f;
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

                public int getTag() {
                    return this.tag_;
                }

                public boolean hasPriority() {
                    return (this.bitField0_ & 8) == 8;
                }

                public int getPriority() {
                    return this.priority_;
                }

                public boolean hasDeepResult() {
                    return (this.bitField0_ & 16) == 16;
                }

                public Result getDeepResult() {
                    return this.deepResult_;
                }

                public ResultOrBuilder getDeepResultOrBuilder() {
                    return this.deepResult_;
                }

                private void initFields() {
                    this.candidate_ = "";
                    this.evidence_ = "";
                    this.tag_ = 0;
                    this.priority_ = 0;
                    this.deepResult_ = getDefaultInstance();
                }

                public final boolean isInitialized() {
                    byte b = this.memoizedIsInitialized;
                    if (b == -1) {
                        this.memoizedIsInitialized = 1;
                        return true;
                    } else if (b == 1) {
                        return true;
                    } else {
                        return false;
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
                        codedOutputStream.writeInt32(3, this.tag_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        codedOutputStream.writeInt32(4, this.priority_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        codedOutputStream.writeMessage(5, this.deepResult_);
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
                        i2 += CodedOutputStream.computeInt32Size(3, this.tag_);
                    }
                    if ((this.bitField0_ & 8) == 8) {
                        i2 += CodedOutputStream.computeInt32Size(4, this.priority_);
                    }
                    if ((this.bitField0_ & 16) == 16) {
                        i2 += CodedOutputStream.computeMessageSize(5, this.deepResult_);
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
                    private SingleFieldBuilder<Result, Builder, ResultOrBuilder> deepResultBuilder_;
                    private Result deepResult_;
                    private Object evidence_;
                    private int priority_;
                    private int tag_;

                    public static final Descriptors.Descriptor getDescriptor() {
                        return ArcticSearchResult.f4014x638969d1;
                    }

                    /* access modifiers changed from: protected */
                    public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                        return ArcticSearchResult.f4015xb5e2f4f;
                    }

                    private Builder() {
                        this.candidate_ = "";
                        this.evidence_ = "";
                        this.deepResult_ = Result.getDefaultInstance();
                        maybeForceBuilderInitialization();
                    }

                    private Builder(GeneratedMessage.BuilderParent builderParent) {
                        super(builderParent);
                        this.candidate_ = "";
                        this.evidence_ = "";
                        this.deepResult_ = Result.getDefaultInstance();
                        maybeForceBuilderInitialization();
                    }

                    private void maybeForceBuilderInitialization() {
                        if (Result.alwaysUseFieldBuilders) {
                            getDeepResultFieldBuilder();
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
                        this.tag_ = 0;
                        this.bitField0_ &= -5;
                        this.priority_ = 0;
                        this.bitField0_ &= -9;
                        if (this.deepResultBuilder_ == null) {
                            this.deepResult_ = Result.getDefaultInstance();
                        } else {
                            this.deepResultBuilder_.clear();
                        }
                        this.bitField0_ &= -17;
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
                        int i;
                        int i2 = 1;
                        Result result = new Result(this);
                        int i3 = this.bitField0_;
                        if ((i3 & 1) != 1) {
                            i2 = 0;
                        }
                        Object unused = result.candidate_ = this.candidate_;
                        if ((i3 & 2) == 2) {
                            i2 |= 2;
                        }
                        Object unused2 = result.evidence_ = this.evidence_;
                        if ((i3 & 4) == 4) {
                            i2 |= 4;
                        }
                        int unused3 = result.tag_ = this.tag_;
                        if ((i3 & 8) == 8) {
                            i2 |= 8;
                        }
                        int unused4 = result.priority_ = this.priority_;
                        if ((i3 & 16) == 16) {
                            i = i2 | 16;
                        } else {
                            i = i2;
                        }
                        if (this.deepResultBuilder_ == null) {
                            Result unused5 = result.deepResult_ = this.deepResult_;
                        } else {
                            Result unused6 = result.deepResult_ = this.deepResultBuilder_.build();
                        }
                        int unused7 = result.bitField0_ = i;
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
                            if (result.hasPriority()) {
                                setPriority(result.getPriority());
                            }
                            if (result.hasDeepResult()) {
                                mergeDeepResult(result.getDeepResult());
                            }
                            mergeUnknownFields(result.getUnknownFields());
                        }
                        return this;
                    }

                    public final boolean isInitialized() {
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
                                    this.candidate_ = codedInputStream.readBytes();
                                    continue;
                                case 18:
                                    this.bitField0_ |= 2;
                                    this.evidence_ = codedInputStream.readBytes();
                                    continue;
                                case 24:
                                    this.bitField0_ |= 4;
                                    this.tag_ = codedInputStream.readInt32();
                                    continue;
                                case 32:
                                    this.bitField0_ |= 8;
                                    this.priority_ = codedInputStream.readInt32();
                                    continue;
                                case Settings.WUBI_DISPLAYCODE:
                                    Builder newBuilder2 = Result.newBuilder();
                                    if (hasDeepResult()) {
                                        newBuilder2.mergeFrom(getDeepResult());
                                    }
                                    codedInputStream.readMessage(newBuilder2, extensionRegistryLite);
                                    setDeepResult(newBuilder2.buildPartial());
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

                    public int getTag() {
                        return this.tag_;
                    }

                    public Builder setTag(int i) {
                        this.bitField0_ |= 4;
                        this.tag_ = i;
                        onChanged();
                        return this;
                    }

                    public Builder clearTag() {
                        this.bitField0_ &= -5;
                        this.tag_ = 0;
                        onChanged();
                        return this;
                    }

                    public boolean hasPriority() {
                        return (this.bitField0_ & 8) == 8;
                    }

                    public int getPriority() {
                        return this.priority_;
                    }

                    public Builder setPriority(int i) {
                        this.bitField0_ |= 8;
                        this.priority_ = i;
                        onChanged();
                        return this;
                    }

                    public Builder clearPriority() {
                        this.bitField0_ &= -9;
                        this.priority_ = 0;
                        onChanged();
                        return this;
                    }

                    public boolean hasDeepResult() {
                        return (this.bitField0_ & 16) == 16;
                    }

                    public Result getDeepResult() {
                        if (this.deepResultBuilder_ == null) {
                            return this.deepResult_;
                        }
                        return this.deepResultBuilder_.getMessage();
                    }

                    public Builder setDeepResult(Result result) {
                        if (this.deepResultBuilder_ != null) {
                            this.deepResultBuilder_.setMessage(result);
                        } else if (result == null) {
                            throw new NullPointerException();
                        } else {
                            this.deepResult_ = result;
                            onChanged();
                        }
                        this.bitField0_ |= 16;
                        return this;
                    }

                    public Builder setDeepResult(Builder builder) {
                        if (this.deepResultBuilder_ == null) {
                            this.deepResult_ = builder.build();
                            onChanged();
                        } else {
                            this.deepResultBuilder_.setMessage(builder.build());
                        }
                        this.bitField0_ |= 16;
                        return this;
                    }

                    public Builder mergeDeepResult(Result result) {
                        if (this.deepResultBuilder_ == null) {
                            if ((this.bitField0_ & 16) != 16 || this.deepResult_ == Result.getDefaultInstance()) {
                                this.deepResult_ = result;
                            } else {
                                this.deepResult_ = Result.newBuilder(this.deepResult_).mergeFrom(result).buildPartial();
                            }
                            onChanged();
                        } else {
                            this.deepResultBuilder_.mergeFrom(result);
                        }
                        this.bitField0_ |= 16;
                        return this;
                    }

                    public Builder clearDeepResult() {
                        if (this.deepResultBuilder_ == null) {
                            this.deepResult_ = Result.getDefaultInstance();
                            onChanged();
                        } else {
                            this.deepResultBuilder_.clear();
                        }
                        this.bitField0_ &= -17;
                        return this;
                    }

                    public Builder getDeepResultBuilder() {
                        this.bitField0_ |= 16;
                        onChanged();
                        return getDeepResultFieldBuilder().getBuilder();
                    }

                    public ResultOrBuilder getDeepResultOrBuilder() {
                        if (this.deepResultBuilder_ != null) {
                            return this.deepResultBuilder_.getMessageOrBuilder();
                        }
                        return this.deepResult_;
                    }

                    private SingleFieldBuilder<Result, Builder, ResultOrBuilder> getDeepResultFieldBuilder() {
                        if (this.deepResultBuilder_ == null) {
                            this.deepResultBuilder_ = new SingleFieldBuilder<>(this.deepResult_, getParentForChildren(), isClean());
                            this.deepResult_ = null;
                        }
                        return this.deepResultBuilder_;
                    }
                }

                static {
                    defaultInstance.initFields();
                }
            }

            public boolean hasHistory() {
                return (this.bitField0_ & 1) == 1;
            }

            public String getHistory() {
                Object obj = this.history_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (Internal.isValidUtf8(byteString)) {
                    this.history_ = stringUtf8;
                }
                return stringUtf8;
            }

            private ByteString getHistoryBytes() {
                Object obj = this.history_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.history_ = copyFromUtf8;
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
                this.history_ = "";
                this.result_ = Collections.emptyList();
            }

            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == -1) {
                    this.memoizedIsInitialized = 1;
                    return true;
                } else if (b == 1) {
                    return true;
                } else {
                    return false;
                }
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.writeBytes(1, getHistoryBytes());
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
                    i = CodedOutputStream.computeBytesSize(1, getHistoryBytes()) + 0;
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

            public static ResultList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return ((Builder) newBuilder().mergeFrom(byteString)).buildParsed();
            }

            public static ResultList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return ((Builder) newBuilder().mergeFrom(byteString, extensionRegistryLite)).buildParsed();
            }

            public static ResultList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return ((Builder) newBuilder().mergeFrom(bArr)).buildParsed();
            }

            public static ResultList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return ((Builder) newBuilder().mergeFrom(bArr, extensionRegistryLite)).buildParsed();
            }

            public static ResultList parseFrom(InputStream inputStream) throws IOException {
                return ((Builder) newBuilder().mergeFrom(inputStream)).buildParsed();
            }

            public static ResultList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return ((Builder) newBuilder().mergeFrom(inputStream, extensionRegistryLite)).buildParsed();
            }

            public static ResultList parseDelimitedFrom(InputStream inputStream) throws IOException {
                Builder newBuilder = newBuilder();
                if (newBuilder.mergeDelimitedFrom(inputStream)) {
                    return newBuilder.buildParsed();
                }
                return null;
            }

            public static ResultList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Builder newBuilder = newBuilder();
                if (newBuilder.mergeDelimitedFrom(inputStream, extensionRegistryLite)) {
                    return newBuilder.buildParsed();
                }
                return null;
            }

            public static ResultList parseFrom(CodedInputStream codedInputStream) throws IOException {
                return ((Builder) newBuilder().mergeFrom(codedInputStream)).buildParsed();
            }

            public static ResultList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return newBuilder().mergeFrom(codedInputStream, extensionRegistryLite).buildParsed();
            }

            public static Builder newBuilder() {
                return Builder.create();
            }

            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder(ResultList resultList) {
                return newBuilder().mergeFrom(resultList);
            }

            public Builder toBuilder() {
                return newBuilder(this);
            }

            /* access modifiers changed from: protected */
            public Builder newBuilderForType(GeneratedMessage.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static final class Builder extends GeneratedMessage.Builder<Builder> implements ResultListOrBuilder {
                private int bitField0_;
                private Object history_;
                private RepeatedFieldBuilder<Result, Result.Builder, ResultOrBuilder> resultBuilder_;
                private List<Result> result_;

                public static final Descriptors.Descriptor getDescriptor() {
                    return ArcticSearchResult.f4016xa25e4a4f;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return ArcticSearchResult.f4017x1101b1cd;
                }

                private Builder() {
                    this.history_ = "";
                    this.result_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private Builder(GeneratedMessage.BuilderParent builderParent) {
                    super(builderParent);
                    this.history_ = "";
                    this.result_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (ResultList.alwaysUseFieldBuilders) {
                        getResultFieldBuilder();
                    }
                }

                /* access modifiers changed from: private */
                public static Builder create() {
                    return new Builder();
                }

                public Builder clear() {
                    super.clear();
                    this.history_ = "";
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
                    return ResultList.getDescriptor();
                }

                public ResultList getDefaultInstanceForType() {
                    return ResultList.getDefaultInstance();
                }

                public ResultList build() {
                    ResultList buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                /* access modifiers changed from: private */
                public ResultList buildParsed() throws InvalidProtocolBufferException {
                    ResultList buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial).asInvalidProtocolBufferException();
                }

                public ResultList buildPartial() {
                    int i = 1;
                    ResultList resultList = new ResultList(this);
                    if ((this.bitField0_ & 1) != 1) {
                        i = 0;
                    }
                    Object unused = resultList.history_ = this.history_;
                    if (this.resultBuilder_ == null) {
                        if ((this.bitField0_ & 2) == 2) {
                            this.result_ = Collections.unmodifiableList(this.result_);
                            this.bitField0_ &= -3;
                        }
                        List unused2 = resultList.result_ = this.result_;
                    } else {
                        List unused3 = resultList.result_ = this.resultBuilder_.build();
                    }
                    int unused4 = resultList.bitField0_ = i;
                    onBuilt();
                    return resultList;
                }

                public Builder mergeFrom(Message message) {
                    if (message instanceof ResultList) {
                        return mergeFrom((ResultList) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(ResultList resultList) {
                    RepeatedFieldBuilder<Result, Result.Builder, ResultOrBuilder> repeatedFieldBuilder = null;
                    if (resultList != ResultList.getDefaultInstance()) {
                        if (resultList.hasHistory()) {
                            setHistory(resultList.getHistory());
                        }
                        if (this.resultBuilder_ == null) {
                            if (!resultList.result_.isEmpty()) {
                                if (this.result_.isEmpty()) {
                                    this.result_ = resultList.result_;
                                    this.bitField0_ &= -3;
                                } else {
                                    ensureResultIsMutable();
                                    this.result_.addAll(resultList.result_);
                                }
                                onChanged();
                            }
                        } else if (!resultList.result_.isEmpty()) {
                            if (this.resultBuilder_.isEmpty()) {
                                this.resultBuilder_.dispose();
                                this.resultBuilder_ = null;
                                this.result_ = resultList.result_;
                                this.bitField0_ &= -3;
                                if (ResultList.alwaysUseFieldBuilders) {
                                    repeatedFieldBuilder = getResultFieldBuilder();
                                }
                                this.resultBuilder_ = repeatedFieldBuilder;
                            } else {
                                this.resultBuilder_.addAllMessages(resultList.result_);
                            }
                        }
                        mergeUnknownFields(resultList.getUnknownFields());
                    }
                    return this;
                }

                public final boolean isInitialized() {
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
                                this.history_ = codedInputStream.readBytes();
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

                public boolean hasHistory() {
                    return (this.bitField0_ & 1) == 1;
                }

                public String getHistory() {
                    Object obj = this.history_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.history_ = stringUtf8;
                    return stringUtf8;
                }

                public Builder setHistory(String str) {
                    if (str == null) {
                        throw new NullPointerException();
                    }
                    this.bitField0_ |= 1;
                    this.history_ = str;
                    onChanged();
                    return this;
                }

                public Builder clearHistory() {
                    this.bitField0_ &= -2;
                    this.history_ = ResultList.getDefaultInstance().getHistory();
                    onChanged();
                    return this;
                }

                /* access modifiers changed from: package-private */
                public void setHistory(ByteString byteString) {
                    this.bitField0_ |= 1;
                    this.history_ = byteString;
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

        public List<ResultList> getResultListList() {
            return this.resultList_;
        }

        public List<? extends ResultListOrBuilder> getResultListOrBuilderList() {
            return this.resultList_;
        }

        public int getResultListCount() {
            return this.resultList_.size();
        }

        public ResultList getResultList(int i) {
            return this.resultList_.get(i);
        }

        public ResultListOrBuilder getResultListOrBuilder(int i) {
            return this.resultList_.get(i);
        }

        public boolean hasCommonHistory() {
            return (this.bitField0_ & 1) == 1;
        }

        public String getCommonHistory() {
            Object obj = this.commonHistory_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (Internal.isValidUtf8(byteString)) {
                this.commonHistory_ = stringUtf8;
            }
            return stringUtf8;
        }

        private ByteString getCommonHistoryBytes() {
            Object obj = this.commonHistory_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.commonHistory_ = copyFromUtf8;
            return copyFromUtf8;
        }

        private void initFields() {
            this.resultList_ = Collections.emptyList();
            this.commonHistory_ = "";
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == -1) {
                this.memoizedIsInitialized = 1;
                return true;
            } else if (b == 1) {
                return true;
            } else {
                return false;
            }
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.resultList_.size()) {
                    break;
                }
                codedOutputStream.writeMessage(1, this.resultList_.get(i2));
                i = i2 + 1;
            }
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBytes(2, getCommonHistoryBytes());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.resultList_.size(); i3++) {
                i2 += CodedOutputStream.computeMessageSize(1, this.resultList_.get(i3));
            }
            if ((this.bitField0_ & 1) == 1) {
                i2 += CodedOutputStream.computeBytesSize(2, getCommonHistoryBytes());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + i2;
            this.memoizedSerializedSize = serializedSize;
            return serializedSize;
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
            private Object commonHistory_;
            private RepeatedFieldBuilder<ResultList, ResultList.Builder, ResultListOrBuilder> resultListBuilder_;
            private List<ResultList> resultList_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ArcticSearchResult.f4018x95197e53;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ArcticSearchResult.f4019x505aa1d1;
            }

            private Builder() {
                this.resultList_ = Collections.emptyList();
                this.commonHistory_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent builderParent) {
                super(builderParent);
                this.resultList_ = Collections.emptyList();
                this.commonHistory_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (SearchResult.alwaysUseFieldBuilders) {
                    getResultListFieldBuilder();
                }
            }

            /* access modifiers changed from: private */
            public static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                if (this.resultListBuilder_ == null) {
                    this.resultList_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    this.resultListBuilder_.clear();
                }
                this.commonHistory_ = "";
                this.bitField0_ &= -3;
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
                int i2 = this.bitField0_;
                if (this.resultListBuilder_ == null) {
                    if ((this.bitField0_ & 1) == 1) {
                        this.resultList_ = Collections.unmodifiableList(this.resultList_);
                        this.bitField0_ &= -2;
                    }
                    List unused = searchResult.resultList_ = this.resultList_;
                } else {
                    List unused2 = searchResult.resultList_ = this.resultListBuilder_.build();
                }
                if ((i2 & 2) != 2) {
                    i = 0;
                }
                Object unused3 = searchResult.commonHistory_ = this.commonHistory_;
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
                RepeatedFieldBuilder<ResultList, ResultList.Builder, ResultListOrBuilder> repeatedFieldBuilder = null;
                if (searchResult != SearchResult.getDefaultInstance()) {
                    if (this.resultListBuilder_ == null) {
                        if (!searchResult.resultList_.isEmpty()) {
                            if (this.resultList_.isEmpty()) {
                                this.resultList_ = searchResult.resultList_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureResultListIsMutable();
                                this.resultList_.addAll(searchResult.resultList_);
                            }
                            onChanged();
                        }
                    } else if (!searchResult.resultList_.isEmpty()) {
                        if (this.resultListBuilder_.isEmpty()) {
                            this.resultListBuilder_.dispose();
                            this.resultListBuilder_ = null;
                            this.resultList_ = searchResult.resultList_;
                            this.bitField0_ &= -2;
                            if (SearchResult.alwaysUseFieldBuilders) {
                                repeatedFieldBuilder = getResultListFieldBuilder();
                            }
                            this.resultListBuilder_ = repeatedFieldBuilder;
                        } else {
                            this.resultListBuilder_.addAllMessages(searchResult.resultList_);
                        }
                    }
                    if (searchResult.hasCommonHistory()) {
                        setCommonHistory(searchResult.getCommonHistory());
                    }
                    mergeUnknownFields(searchResult.getUnknownFields());
                }
                return this;
            }

            public final boolean isInitialized() {
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
                            ResultList.Builder newBuilder2 = ResultList.newBuilder();
                            codedInputStream.readMessage(newBuilder2, extensionRegistryLite);
                            addResultList(newBuilder2.buildPartial());
                            continue;
                        case 18:
                            this.bitField0_ |= 2;
                            this.commonHistory_ = codedInputStream.readBytes();
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

            private void ensureResultListIsMutable() {
                if ((this.bitField0_ & 1) != 1) {
                    this.resultList_ = new ArrayList(this.resultList_);
                    this.bitField0_ |= 1;
                }
            }

            public List<ResultList> getResultListList() {
                if (this.resultListBuilder_ == null) {
                    return Collections.unmodifiableList(this.resultList_);
                }
                return this.resultListBuilder_.getMessageList();
            }

            public int getResultListCount() {
                if (this.resultListBuilder_ == null) {
                    return this.resultList_.size();
                }
                return this.resultListBuilder_.getCount();
            }

            public ResultList getResultList(int i) {
                if (this.resultListBuilder_ == null) {
                    return this.resultList_.get(i);
                }
                return this.resultListBuilder_.getMessage(i);
            }

            public Builder setResultList(int i, ResultList resultList) {
                if (this.resultListBuilder_ != null) {
                    this.resultListBuilder_.setMessage(i, resultList);
                } else if (resultList == null) {
                    throw new NullPointerException();
                } else {
                    ensureResultListIsMutable();
                    this.resultList_.set(i, resultList);
                    onChanged();
                }
                return this;
            }

            public Builder setResultList(int i, ResultList.Builder builder) {
                if (this.resultListBuilder_ == null) {
                    ensureResultListIsMutable();
                    this.resultList_.set(i, builder.build());
                    onChanged();
                } else {
                    this.resultListBuilder_.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addResultList(ResultList resultList) {
                if (this.resultListBuilder_ != null) {
                    this.resultListBuilder_.addMessage(resultList);
                } else if (resultList == null) {
                    throw new NullPointerException();
                } else {
                    ensureResultListIsMutable();
                    this.resultList_.add(resultList);
                    onChanged();
                }
                return this;
            }

            public Builder addResultList(int i, ResultList resultList) {
                if (this.resultListBuilder_ != null) {
                    this.resultListBuilder_.addMessage(i, resultList);
                } else if (resultList == null) {
                    throw new NullPointerException();
                } else {
                    ensureResultListIsMutable();
                    this.resultList_.add(i, resultList);
                    onChanged();
                }
                return this;
            }

            public Builder addResultList(ResultList.Builder builder) {
                if (this.resultListBuilder_ == null) {
                    ensureResultListIsMutable();
                    this.resultList_.add(builder.build());
                    onChanged();
                } else {
                    this.resultListBuilder_.addMessage(builder.build());
                }
                return this;
            }

            public Builder addResultList(int i, ResultList.Builder builder) {
                if (this.resultListBuilder_ == null) {
                    ensureResultListIsMutable();
                    this.resultList_.add(i, builder.build());
                    onChanged();
                } else {
                    this.resultListBuilder_.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllResultList(Iterable<? extends ResultList> iterable) {
                if (this.resultListBuilder_ == null) {
                    ensureResultListIsMutable();
                    GeneratedMessage.Builder.addAll(iterable, this.resultList_);
                    onChanged();
                } else {
                    this.resultListBuilder_.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearResultList() {
                if (this.resultListBuilder_ == null) {
                    this.resultList_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    this.resultListBuilder_.clear();
                }
                return this;
            }

            public Builder removeResultList(int i) {
                if (this.resultListBuilder_ == null) {
                    ensureResultListIsMutable();
                    this.resultList_.remove(i);
                    onChanged();
                } else {
                    this.resultListBuilder_.remove(i);
                }
                return this;
            }

            public ResultList.Builder getResultListBuilder(int i) {
                return getResultListFieldBuilder().getBuilder(i);
            }

            public ResultListOrBuilder getResultListOrBuilder(int i) {
                if (this.resultListBuilder_ == null) {
                    return this.resultList_.get(i);
                }
                return this.resultListBuilder_.getMessageOrBuilder(i);
            }

            public List<? extends ResultListOrBuilder> getResultListOrBuilderList() {
                if (this.resultListBuilder_ != null) {
                    return this.resultListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.resultList_);
            }

            public ResultList.Builder addResultListBuilder() {
                return getResultListFieldBuilder().addBuilder(ResultList.getDefaultInstance());
            }

            public ResultList.Builder addResultListBuilder(int i) {
                return getResultListFieldBuilder().addBuilder(i, ResultList.getDefaultInstance());
            }

            public List<ResultList.Builder> getResultListBuilderList() {
                return getResultListFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<ResultList, ResultList.Builder, ResultListOrBuilder> getResultListFieldBuilder() {
                boolean z = true;
                if (this.resultListBuilder_ == null) {
                    List<ResultList> list = this.resultList_;
                    if ((this.bitField0_ & 1) != 1) {
                        z = false;
                    }
                    this.resultListBuilder_ = new RepeatedFieldBuilder<>(list, z, getParentForChildren(), isClean());
                    this.resultList_ = null;
                }
                return this.resultListBuilder_;
            }

            public boolean hasCommonHistory() {
                return (this.bitField0_ & 2) == 2;
            }

            public String getCommonHistory() {
                Object obj = this.commonHistory_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.commonHistory_ = stringUtf8;
                return stringUtf8;
            }

            public Builder setCommonHistory(String str) {
                if (str == null) {
                    throw new NullPointerException();
                }
                this.bitField0_ |= 2;
                this.commonHistory_ = str;
                onChanged();
                return this;
            }

            public Builder clearCommonHistory() {
                this.bitField0_ &= -3;
                this.commonHistory_ = SearchResult.getDefaultInstance().getCommonHistory();
                onChanged();
                return this;
            }

            /* access modifiers changed from: package-private */
            public void setCommonHistory(ByteString byteString) {
                this.bitField0_ |= 2;
                this.commonHistory_ = byteString;
                onChanged();
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
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018ArcticSearchResult.proto\u0012#com.cootek.smartinput5.engine.cloke\"\u0003\n\fSearchResult\u0012Q\n\u000bresult_list\u0018\u0001 \u0003(\u000b2<.com.cootek.smartinput5.engine.cloke.SearchResult.ResultList\u0012\u0016\n\u000ecommon_history\u0018\u0002 \u0001(\t\u001a\u0002\n\nResultList\u0012\u000f\n\u0007history\u0018\u0001 \u0001(\t\u0012S\n\u0006result\u0018\u0002 \u0003(\u000b2C.com.cootek.smartinput5.engine.cloke.SearchResult.ResultList.Result\u001a¦\u0001\n\u0006Result\u0012\u0011\n\tcandidate\u0018\u0001 \u0001(\t\u0012\u0010\n\bevidence\u0018\u0002 \u0001(\t\u0012\u000b\n\u0003tag\u0018\u0003 \u0001(\u0005\u0012\u0010\n\bpriority\u0018\u0004 \u0001(\u0005\u0012X\n\u000bdeep_result\u0018\u0005", " \u0001(\u000b2C.com.cootek.smartinput5.engine.cloke.SearchResult.ResultList.Result"}, new Descriptors.FileDescriptor[0], new Descriptors.FileDescriptor.InternalDescriptorAssigner() {
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = ArcticSearchResult.descriptor = fileDescriptor;
                Descriptors.Descriptor unused2 = ArcticSearchResult.f4018x95197e53 = ArcticSearchResult.getDescriptor().getMessageTypes().get(0);
                GeneratedMessage.FieldAccessorTable unused3 = ArcticSearchResult.f4019x505aa1d1 = new GeneratedMessage.FieldAccessorTable(ArcticSearchResult.f4018x95197e53, new String[]{"ResultList", "CommonHistory"}, SearchResult.class, SearchResult.Builder.class);
                Descriptors.Descriptor unused4 = ArcticSearchResult.f4016xa25e4a4f = ArcticSearchResult.f4018x95197e53.getNestedTypes().get(0);
                GeneratedMessage.FieldAccessorTable unused5 = ArcticSearchResult.f4017x1101b1cd = new GeneratedMessage.FieldAccessorTable(ArcticSearchResult.f4016xa25e4a4f, new String[]{"History", "Result"}, SearchResult.ResultList.class, SearchResult.ResultList.Builder.class);
                Descriptors.Descriptor unused6 = ArcticSearchResult.f4014x638969d1 = ArcticSearchResult.f4016xa25e4a4f.getNestedTypes().get(0);
                GeneratedMessage.FieldAccessorTable unused7 = ArcticSearchResult.f4015xb5e2f4f = new GeneratedMessage.FieldAccessorTable(ArcticSearchResult.f4014x638969d1, new String[]{"Candidate", "Evidence", "Tag", "Priority", "DeepResult"}, SearchResult.ResultList.Result.class, SearchResult.ResultList.Result.Builder.class);
                return null;
            }
        });
    }
}
