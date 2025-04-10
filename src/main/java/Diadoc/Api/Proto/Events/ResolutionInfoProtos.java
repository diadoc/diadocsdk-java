// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: Events/ResolutionInfo.proto
// Protobuf Java Version: 4.28.3

package Diadoc.Api.Proto.Events;

public final class ResolutionInfoProtos {
  private ResolutionInfoProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      ResolutionInfoProtos.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ResolutionInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.Events.ResolutionInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .Diadoc.Api.Proto.ResolutionType ResolutionType = 1 [default = UnknownResolutionType];</code>
     * @return Whether the resolutionType field is set.
     */
    boolean hasResolutionType();
    /**
     * <code>optional .Diadoc.Api.Proto.ResolutionType ResolutionType = 1 [default = UnknownResolutionType];</code>
     * @return The resolutionType.
     */
    Diadoc.Api.Proto.ResolutionTypeProtos.ResolutionType getResolutionType();

    /**
     * <pre>
     * ФИО согласователя
     * </pre>
     *
     * <code>required string Author = 2;</code>
     * @return Whether the author field is set.
     */
    boolean hasAuthor();
    /**
     * <pre>
     * ФИО согласователя
     * </pre>
     *
     * <code>required string Author = 2;</code>
     * @return The author.
     */
    java.lang.String getAuthor();
    /**
     * <pre>
     * ФИО согласователя
     * </pre>
     *
     * <code>required string Author = 2;</code>
     * @return The bytes for author.
     */
    com.google.protobuf.ByteString
        getAuthorBytes();

    /**
     * <code>optional string InitialRequestId = 3;</code>
     * @return Whether the initialRequestId field is set.
     */
    boolean hasInitialRequestId();
    /**
     * <code>optional string InitialRequestId = 3;</code>
     * @return The initialRequestId.
     */
    java.lang.String getInitialRequestId();
    /**
     * <code>optional string InitialRequestId = 3;</code>
     * @return The bytes for initialRequestId.
     */
    com.google.protobuf.ByteString
        getInitialRequestIdBytes();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.Events.ResolutionInfo}
   */
  public static final class ResolutionInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.Events.ResolutionInfo)
      ResolutionInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 3,
        /* suffix= */ "",
        ResolutionInfo.class.getName());
    }
    // Use ResolutionInfo.newBuilder() to construct.
    private ResolutionInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private ResolutionInfo() {
      resolutionType_ = -1;
      author_ = "";
      initialRequestId_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.Events.ResolutionInfoProtos.internal_static_Diadoc_Api_Proto_Events_ResolutionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.Events.ResolutionInfoProtos.internal_static_Diadoc_Api_Proto_Events_ResolutionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo.class, Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo.Builder.class);
    }

    private int bitField0_;
    public static final int RESOLUTIONTYPE_FIELD_NUMBER = 1;
    private int resolutionType_ = -1;
    /**
     * <code>optional .Diadoc.Api.Proto.ResolutionType ResolutionType = 1 [default = UnknownResolutionType];</code>
     * @return Whether the resolutionType field is set.
     */
    @java.lang.Override public boolean hasResolutionType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .Diadoc.Api.Proto.ResolutionType ResolutionType = 1 [default = UnknownResolutionType];</code>
     * @return The resolutionType.
     */
    @java.lang.Override public Diadoc.Api.Proto.ResolutionTypeProtos.ResolutionType getResolutionType() {
      Diadoc.Api.Proto.ResolutionTypeProtos.ResolutionType result = Diadoc.Api.Proto.ResolutionTypeProtos.ResolutionType.forNumber(resolutionType_);
      return result == null ? Diadoc.Api.Proto.ResolutionTypeProtos.ResolutionType.UnknownResolutionType : result;
    }

    public static final int AUTHOR_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object author_ = "";
    /**
     * <pre>
     * ФИО согласователя
     * </pre>
     *
     * <code>required string Author = 2;</code>
     * @return Whether the author field is set.
     */
    @java.lang.Override
    public boolean hasAuthor() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * ФИО согласователя
     * </pre>
     *
     * <code>required string Author = 2;</code>
     * @return The author.
     */
    @java.lang.Override
    public java.lang.String getAuthor() {
      java.lang.Object ref = author_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          author_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * ФИО согласователя
     * </pre>
     *
     * <code>required string Author = 2;</code>
     * @return The bytes for author.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAuthorBytes() {
      java.lang.Object ref = author_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        author_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int INITIALREQUESTID_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object initialRequestId_ = "";
    /**
     * <code>optional string InitialRequestId = 3;</code>
     * @return Whether the initialRequestId field is set.
     */
    @java.lang.Override
    public boolean hasInitialRequestId() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string InitialRequestId = 3;</code>
     * @return The initialRequestId.
     */
    @java.lang.Override
    public java.lang.String getInitialRequestId() {
      java.lang.Object ref = initialRequestId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          initialRequestId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string InitialRequestId = 3;</code>
     * @return The bytes for initialRequestId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getInitialRequestIdBytes() {
      java.lang.Object ref = initialRequestId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        initialRequestId_ = b;
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

      if (!hasAuthor()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeEnum(1, resolutionType_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, author_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 3, initialRequestId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, resolutionType_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, author_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(3, initialRequestId_);
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
      if (!(obj instanceof Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo)) {
        return super.equals(obj);
      }
      Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo other = (Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo) obj;

      if (hasResolutionType() != other.hasResolutionType()) return false;
      if (hasResolutionType()) {
        if (resolutionType_ != other.resolutionType_) return false;
      }
      if (hasAuthor() != other.hasAuthor()) return false;
      if (hasAuthor()) {
        if (!getAuthor()
            .equals(other.getAuthor())) return false;
      }
      if (hasInitialRequestId() != other.hasInitialRequestId()) return false;
      if (hasInitialRequestId()) {
        if (!getInitialRequestId()
            .equals(other.getInitialRequestId())) return false;
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
      if (hasResolutionType()) {
        hash = (37 * hash) + RESOLUTIONTYPE_FIELD_NUMBER;
        hash = (53 * hash) + resolutionType_;
      }
      if (hasAuthor()) {
        hash = (37 * hash) + AUTHOR_FIELD_NUMBER;
        hash = (53 * hash) + getAuthor().hashCode();
      }
      if (hasInitialRequestId()) {
        hash = (37 * hash) + INITIALREQUESTID_FIELD_NUMBER;
        hash = (53 * hash) + getInitialRequestId().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo parseFrom(
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
    public static Builder newBuilder(Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo prototype) {
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
     * Protobuf type {@code Diadoc.Api.Proto.Events.ResolutionInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.Events.ResolutionInfo)
        Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.Events.ResolutionInfoProtos.internal_static_Diadoc_Api_Proto_Events_ResolutionInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.Events.ResolutionInfoProtos.internal_static_Diadoc_Api_Proto_Events_ResolutionInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo.class, Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo.newBuilder()
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
        resolutionType_ = -1;
        author_ = "";
        initialRequestId_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.Events.ResolutionInfoProtos.internal_static_Diadoc_Api_Proto_Events_ResolutionInfo_descriptor;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo getDefaultInstanceForType() {
        return Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo.getDefaultInstance();
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo build() {
        Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo buildPartial() {
        Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo result = new Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.resolutionType_ = resolutionType_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.author_ = author_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.initialRequestId_ = initialRequestId_;
          to_bitField0_ |= 0x00000004;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo) {
          return mergeFrom((Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo other) {
        if (other == Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo.getDefaultInstance()) return this;
        if (other.hasResolutionType()) {
          setResolutionType(other.getResolutionType());
        }
        if (other.hasAuthor()) {
          author_ = other.author_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.hasInitialRequestId()) {
          initialRequestId_ = other.initialRequestId_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasAuthor()) {
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
              case 8: {
                int tmpRaw = input.readEnum();
                Diadoc.Api.Proto.ResolutionTypeProtos.ResolutionType tmpValue =
                    Diadoc.Api.Proto.ResolutionTypeProtos.ResolutionType.forNumber(tmpRaw);
                if (tmpValue == null) {
                  mergeUnknownVarintField(1, tmpRaw);
                } else {
                  resolutionType_ = tmpRaw;
                  bitField0_ |= 0x00000001;
                }
                break;
              } // case 8
              case 18: {
                author_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                initialRequestId_ = input.readBytes();
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

      private int resolutionType_ = -1;
      /**
       * <code>optional .Diadoc.Api.Proto.ResolutionType ResolutionType = 1 [default = UnknownResolutionType];</code>
       * @return Whether the resolutionType field is set.
       */
      @java.lang.Override public boolean hasResolutionType() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .Diadoc.Api.Proto.ResolutionType ResolutionType = 1 [default = UnknownResolutionType];</code>
       * @return The resolutionType.
       */
      @java.lang.Override
      public Diadoc.Api.Proto.ResolutionTypeProtos.ResolutionType getResolutionType() {
        Diadoc.Api.Proto.ResolutionTypeProtos.ResolutionType result = Diadoc.Api.Proto.ResolutionTypeProtos.ResolutionType.forNumber(resolutionType_);
        return result == null ? Diadoc.Api.Proto.ResolutionTypeProtos.ResolutionType.UnknownResolutionType : result;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.ResolutionType ResolutionType = 1 [default = UnknownResolutionType];</code>
       * @param value The resolutionType to set.
       * @return This builder for chaining.
       */
      public Builder setResolutionType(Diadoc.Api.Proto.ResolutionTypeProtos.ResolutionType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        resolutionType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.ResolutionType ResolutionType = 1 [default = UnknownResolutionType];</code>
       * @return This builder for chaining.
       */
      public Builder clearResolutionType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        resolutionType_ = -1;
        onChanged();
        return this;
      }

      private java.lang.Object author_ = "";
      /**
       * <pre>
       * ФИО согласователя
       * </pre>
       *
       * <code>required string Author = 2;</code>
       * @return Whether the author field is set.
       */
      public boolean hasAuthor() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * ФИО согласователя
       * </pre>
       *
       * <code>required string Author = 2;</code>
       * @return The author.
       */
      public java.lang.String getAuthor() {
        java.lang.Object ref = author_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            author_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * ФИО согласователя
       * </pre>
       *
       * <code>required string Author = 2;</code>
       * @return The bytes for author.
       */
      public com.google.protobuf.ByteString
          getAuthorBytes() {
        java.lang.Object ref = author_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          author_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * ФИО согласователя
       * </pre>
       *
       * <code>required string Author = 2;</code>
       * @param value The author to set.
       * @return This builder for chaining.
       */
      public Builder setAuthor(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        author_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ФИО согласователя
       * </pre>
       *
       * <code>required string Author = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuthor() {
        author_ = getDefaultInstance().getAuthor();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ФИО согласователя
       * </pre>
       *
       * <code>required string Author = 2;</code>
       * @param value The bytes for author to set.
       * @return This builder for chaining.
       */
      public Builder setAuthorBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        author_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object initialRequestId_ = "";
      /**
       * <code>optional string InitialRequestId = 3;</code>
       * @return Whether the initialRequestId field is set.
       */
      public boolean hasInitialRequestId() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional string InitialRequestId = 3;</code>
       * @return The initialRequestId.
       */
      public java.lang.String getInitialRequestId() {
        java.lang.Object ref = initialRequestId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            initialRequestId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string InitialRequestId = 3;</code>
       * @return The bytes for initialRequestId.
       */
      public com.google.protobuf.ByteString
          getInitialRequestIdBytes() {
        java.lang.Object ref = initialRequestId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          initialRequestId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string InitialRequestId = 3;</code>
       * @param value The initialRequestId to set.
       * @return This builder for chaining.
       */
      public Builder setInitialRequestId(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        initialRequestId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>optional string InitialRequestId = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearInitialRequestId() {
        initialRequestId_ = getDefaultInstance().getInitialRequestId();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>optional string InitialRequestId = 3;</code>
       * @param value The bytes for initialRequestId to set.
       * @return This builder for chaining.
       */
      public Builder setInitialRequestIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        initialRequestId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.Events.ResolutionInfo)
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.Events.ResolutionInfo)
    private static final Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo();
    }

    public static Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResolutionInfo>
        PARSER = new com.google.protobuf.AbstractParser<ResolutionInfo>() {
      @java.lang.Override
      public ResolutionInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ResolutionInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ResolutionInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public Diadoc.Api.Proto.Events.ResolutionInfoProtos.ResolutionInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_Events_ResolutionInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_Events_ResolutionInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033Events/ResolutionInfo.proto\022\027Diadoc.Ap" +
      "i.Proto.Events\032\024ResolutionType.proto\"\213\001\n" +
      "\016ResolutionInfo\022O\n\016ResolutionType\030\001 \001(\0162" +
      " .Diadoc.Api.Proto.ResolutionType:\025Unkno" +
      "wnResolutionType\022\016\n\006Author\030\002 \002(\t\022\030\n\020Init" +
      "ialRequestId\030\003 \001(\tB\026B\024ResolutionInfoProt" +
      "os"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          Diadoc.Api.Proto.ResolutionTypeProtos.getDescriptor(),
        });
    internal_static_Diadoc_Api_Proto_Events_ResolutionInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_Events_ResolutionInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_Events_ResolutionInfo_descriptor,
        new java.lang.String[] { "ResolutionType", "Author", "InitialRequestId", });
    descriptor.resolveAllFeaturesImmutable();
    Diadoc.Api.Proto.ResolutionTypeProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
