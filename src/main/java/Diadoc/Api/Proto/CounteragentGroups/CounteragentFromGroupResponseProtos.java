// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: CounteragentGroups/CounteragentFromGroupResponse.proto
// Protobuf Java Version: 4.28.1

package Diadoc.Api.Proto.CounteragentGroups;

public final class CounteragentFromGroupResponseProtos {
  private CounteragentFromGroupResponseProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      CounteragentFromGroupResponseProtos.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CounteragentFromGroupResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated string CounteragentBoxId = 1;</code>
     * @return A list containing the counteragentBoxId.
     */
    java.util.List<java.lang.String>
        getCounteragentBoxIdList();
    /**
     * <code>repeated string CounteragentBoxId = 1;</code>
     * @return The count of counteragentBoxId.
     */
    int getCounteragentBoxIdCount();
    /**
     * <code>repeated string CounteragentBoxId = 1;</code>
     * @param index The index of the element to return.
     * @return The counteragentBoxId at the given index.
     */
    java.lang.String getCounteragentBoxId(int index);
    /**
     * <code>repeated string CounteragentBoxId = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the counteragentBoxId at the given index.
     */
    com.google.protobuf.ByteString
        getCounteragentBoxIdBytes(int index);

    /**
     * <code>required int32 TotalCount = 2;</code>
     * @return Whether the totalCount field is set.
     */
    boolean hasTotalCount();
    /**
     * <code>required int32 TotalCount = 2;</code>
     * @return The totalCount.
     */
    int getTotalCount();

    /**
     * <code>optional string AfterIndexKey = 3;</code>
     * @return Whether the afterIndexKey field is set.
     */
    boolean hasAfterIndexKey();
    /**
     * <code>optional string AfterIndexKey = 3;</code>
     * @return The afterIndexKey.
     */
    java.lang.String getAfterIndexKey();
    /**
     * <code>optional string AfterIndexKey = 3;</code>
     * @return The bytes for afterIndexKey.
     */
    com.google.protobuf.ByteString
        getAfterIndexKeyBytes();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponse}
   */
  public static final class CounteragentFromGroupResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponse)
      CounteragentFromGroupResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 1,
        /* suffix= */ "",
        CounteragentFromGroupResponse.class.getName());
    }
    // Use CounteragentFromGroupResponse.newBuilder() to construct.
    private CounteragentFromGroupResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private CounteragentFromGroupResponse() {
      counteragentBoxId_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      afterIndexKey_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentFromGroupResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentFromGroupResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse.class, Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse.Builder.class);
    }

    private int bitField0_;
    public static final int COUNTERAGENTBOXID_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringArrayList counteragentBoxId_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    /**
     * <code>repeated string CounteragentBoxId = 1;</code>
     * @return A list containing the counteragentBoxId.
     */
    public com.google.protobuf.ProtocolStringList
        getCounteragentBoxIdList() {
      return counteragentBoxId_;
    }
    /**
     * <code>repeated string CounteragentBoxId = 1;</code>
     * @return The count of counteragentBoxId.
     */
    public int getCounteragentBoxIdCount() {
      return counteragentBoxId_.size();
    }
    /**
     * <code>repeated string CounteragentBoxId = 1;</code>
     * @param index The index of the element to return.
     * @return The counteragentBoxId at the given index.
     */
    public java.lang.String getCounteragentBoxId(int index) {
      return counteragentBoxId_.get(index);
    }
    /**
     * <code>repeated string CounteragentBoxId = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the counteragentBoxId at the given index.
     */
    public com.google.protobuf.ByteString
        getCounteragentBoxIdBytes(int index) {
      return counteragentBoxId_.getByteString(index);
    }

    public static final int TOTALCOUNT_FIELD_NUMBER = 2;
    private int totalCount_ = 0;
    /**
     * <code>required int32 TotalCount = 2;</code>
     * @return Whether the totalCount field is set.
     */
    @java.lang.Override
    public boolean hasTotalCount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required int32 TotalCount = 2;</code>
     * @return The totalCount.
     */
    @java.lang.Override
    public int getTotalCount() {
      return totalCount_;
    }

    public static final int AFTERINDEXKEY_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object afterIndexKey_ = "";
    /**
     * <code>optional string AfterIndexKey = 3;</code>
     * @return Whether the afterIndexKey field is set.
     */
    @java.lang.Override
    public boolean hasAfterIndexKey() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string AfterIndexKey = 3;</code>
     * @return The afterIndexKey.
     */
    @java.lang.Override
    public java.lang.String getAfterIndexKey() {
      java.lang.Object ref = afterIndexKey_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          afterIndexKey_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string AfterIndexKey = 3;</code>
     * @return The bytes for afterIndexKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAfterIndexKeyBytes() {
      java.lang.Object ref = afterIndexKey_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        afterIndexKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTotalCount()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < counteragentBoxId_.size(); i++) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, counteragentBoxId_.getRaw(i));
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeInt32(2, totalCount_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 3, afterIndexKey_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < counteragentBoxId_.size(); i++) {
          dataSize += computeStringSizeNoTag(counteragentBoxId_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getCounteragentBoxIdList().size();
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, totalCount_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(3, afterIndexKey_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse)) {
        return super.equals(obj);
      }
      Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse other = (Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse) obj;

      if (!getCounteragentBoxIdList()
          .equals(other.getCounteragentBoxIdList())) return false;
      if (hasTotalCount() != other.hasTotalCount()) return false;
      if (hasTotalCount()) {
        if (getTotalCount()
            != other.getTotalCount()) return false;
      }
      if (hasAfterIndexKey() != other.hasAfterIndexKey()) return false;
      if (hasAfterIndexKey()) {
        if (!getAfterIndexKey()
            .equals(other.getAfterIndexKey())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getCounteragentBoxIdCount() > 0) {
        hash = (37 * hash) + COUNTERAGENTBOXID_FIELD_NUMBER;
        hash = (53 * hash) + getCounteragentBoxIdList().hashCode();
      }
      if (hasTotalCount()) {
        hash = (37 * hash) + TOTALCOUNT_FIELD_NUMBER;
        hash = (53 * hash) + getTotalCount();
      }
      if (hasAfterIndexKey()) {
        hash = (37 * hash) + AFTERINDEXKEY_FIELD_NUMBER;
        hash = (53 * hash) + getAfterIndexKey().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponse)
        Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentFromGroupResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentFromGroupResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse.class, Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        counteragentBoxId_ =
            com.google.protobuf.LazyStringArrayList.emptyList();
        totalCount_ = 0;
        afterIndexKey_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentFromGroupResponse_descriptor;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse getDefaultInstanceForType() {
        return Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse.getDefaultInstance();
      }

      @java.lang.Override
      public Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse build() {
        Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse buildPartial() {
        Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse result = new Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          counteragentBoxId_.makeImmutable();
          result.counteragentBoxId_ = counteragentBoxId_;
        }
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.totalCount_ = totalCount_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.afterIndexKey_ = afterIndexKey_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse) {
          return mergeFrom((Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse other) {
        if (other == Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse.getDefaultInstance()) return this;
        if (!other.counteragentBoxId_.isEmpty()) {
          if (counteragentBoxId_.isEmpty()) {
            counteragentBoxId_ = other.counteragentBoxId_;
            bitField0_ |= 0x00000001;
          } else {
            ensureCounteragentBoxIdIsMutable();
            counteragentBoxId_.addAll(other.counteragentBoxId_);
          }
          onChanged();
        }
        if (other.hasTotalCount()) {
          setTotalCount(other.getTotalCount());
        }
        if (other.hasAfterIndexKey()) {
          afterIndexKey_ = other.afterIndexKey_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasTotalCount()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                com.google.protobuf.ByteString bs = input.readBytes();
                ensureCounteragentBoxIdIsMutable();
                counteragentBoxId_.add(bs);
                break;
              } // case 10
              case 16: {
                totalCount_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 26: {
                afterIndexKey_ = input.readBytes();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.LazyStringArrayList counteragentBoxId_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      private void ensureCounteragentBoxIdIsMutable() {
        if (!counteragentBoxId_.isModifiable()) {
          counteragentBoxId_ = new com.google.protobuf.LazyStringArrayList(counteragentBoxId_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated string CounteragentBoxId = 1;</code>
       * @return A list containing the counteragentBoxId.
       */
      public com.google.protobuf.ProtocolStringList
          getCounteragentBoxIdList() {
        counteragentBoxId_.makeImmutable();
        return counteragentBoxId_;
      }
      /**
       * <code>repeated string CounteragentBoxId = 1;</code>
       * @return The count of counteragentBoxId.
       */
      public int getCounteragentBoxIdCount() {
        return counteragentBoxId_.size();
      }
      /**
       * <code>repeated string CounteragentBoxId = 1;</code>
       * @param index The index of the element to return.
       * @return The counteragentBoxId at the given index.
       */
      public java.lang.String getCounteragentBoxId(int index) {
        return counteragentBoxId_.get(index);
      }
      /**
       * <code>repeated string CounteragentBoxId = 1;</code>
       * @param index The index of the value to return.
       * @return The bytes of the counteragentBoxId at the given index.
       */
      public com.google.protobuf.ByteString
          getCounteragentBoxIdBytes(int index) {
        return counteragentBoxId_.getByteString(index);
      }
      /**
       * <code>repeated string CounteragentBoxId = 1;</code>
       * @param index The index to set the value at.
       * @param value The counteragentBoxId to set.
       * @return This builder for chaining.
       */
      public Builder setCounteragentBoxId(
          int index, java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureCounteragentBoxIdIsMutable();
        counteragentBoxId_.set(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string CounteragentBoxId = 1;</code>
       * @param value The counteragentBoxId to add.
       * @return This builder for chaining.
       */
      public Builder addCounteragentBoxId(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureCounteragentBoxIdIsMutable();
        counteragentBoxId_.add(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string CounteragentBoxId = 1;</code>
       * @param values The counteragentBoxId to add.
       * @return This builder for chaining.
       */
      public Builder addAllCounteragentBoxId(
          java.lang.Iterable<java.lang.String> values) {
        ensureCounteragentBoxIdIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, counteragentBoxId_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string CounteragentBoxId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCounteragentBoxId() {
        counteragentBoxId_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string CounteragentBoxId = 1;</code>
       * @param value The bytes of the counteragentBoxId to add.
       * @return This builder for chaining.
       */
      public Builder addCounteragentBoxIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        ensureCounteragentBoxIdIsMutable();
        counteragentBoxId_.add(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private int totalCount_ ;
      /**
       * <code>required int32 TotalCount = 2;</code>
       * @return Whether the totalCount field is set.
       */
      @java.lang.Override
      public boolean hasTotalCount() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required int32 TotalCount = 2;</code>
       * @return The totalCount.
       */
      @java.lang.Override
      public int getTotalCount() {
        return totalCount_;
      }
      /**
       * <code>required int32 TotalCount = 2;</code>
       * @param value The totalCount to set.
       * @return This builder for chaining.
       */
      public Builder setTotalCount(int value) {

        totalCount_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 TotalCount = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalCount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        totalCount_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object afterIndexKey_ = "";
      /**
       * <code>optional string AfterIndexKey = 3;</code>
       * @return Whether the afterIndexKey field is set.
       */
      public boolean hasAfterIndexKey() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional string AfterIndexKey = 3;</code>
       * @return The afterIndexKey.
       */
      public java.lang.String getAfterIndexKey() {
        java.lang.Object ref = afterIndexKey_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            afterIndexKey_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string AfterIndexKey = 3;</code>
       * @return The bytes for afterIndexKey.
       */
      public com.google.protobuf.ByteString
          getAfterIndexKeyBytes() {
        java.lang.Object ref = afterIndexKey_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          afterIndexKey_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string AfterIndexKey = 3;</code>
       * @param value The afterIndexKey to set.
       * @return This builder for chaining.
       */
      public Builder setAfterIndexKey(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        afterIndexKey_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>optional string AfterIndexKey = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAfterIndexKey() {
        afterIndexKey_ = getDefaultInstance().getAfterIndexKey();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>optional string AfterIndexKey = 3;</code>
       * @param value The bytes for afterIndexKey to set.
       * @return This builder for chaining.
       */
      public Builder setAfterIndexKeyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        afterIndexKey_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponse)
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponse)
    private static final Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse();
    }

    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CounteragentFromGroupResponse>
        PARSER = new com.google.protobuf.AbstractParser<CounteragentFromGroupResponse>() {
      @java.lang.Override
      public CounteragentFromGroupResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<CounteragentFromGroupResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CounteragentFromGroupResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public Diadoc.Api.Proto.CounteragentGroups.CounteragentFromGroupResponseProtos.CounteragentFromGroupResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentFromGroupResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentFromGroupResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6CounteragentGroups/CounteragentFromGro" +
      "upResponse.proto\022#Diadoc.Api.Proto.Count" +
      "eragentGroups\"e\n\035CounteragentFromGroupRe" +
      "sponse\022\031\n\021CounteragentBoxId\030\001 \003(\t\022\022\n\nTot" +
      "alCount\030\002 \002(\005\022\025\n\rAfterIndexKey\030\003 \001(\tB%B#" +
      "CounteragentFromGroupResponseProtos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentFromGroupResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentFromGroupResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentFromGroupResponse_descriptor,
        new java.lang.String[] { "CounteragentBoxId", "TotalCount", "AfterIndexKey", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
