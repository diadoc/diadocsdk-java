// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: Events/ResolutionRequestDenialInfo.proto
// Protobuf Java Version: 4.28.1

package Diadoc.Api.Proto.Events;

public final class ResolutionRequestDenialInfoProtos {
  private ResolutionRequestDenialInfoProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      ResolutionRequestDenialInfoProtos.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ResolutionRequestDenialInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.Events.ResolutionRequestDenialInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string Author = 1;</code>
     * @return Whether the author field is set.
     */
    boolean hasAuthor();
    /**
     * <code>required string Author = 1;</code>
     * @return The author.
     */
    java.lang.String getAuthor();
    /**
     * <code>required string Author = 1;</code>
     * @return The bytes for author.
     */
    com.google.protobuf.ByteString
        getAuthorBytes();

    /**
     * <code>optional string InitialRequestId = 2;</code>
     * @return Whether the initialRequestId field is set.
     */
    boolean hasInitialRequestId();
    /**
     * <code>optional string InitialRequestId = 2;</code>
     * @return The initialRequestId.
     */
    java.lang.String getInitialRequestId();
    /**
     * <code>optional string InitialRequestId = 2;</code>
     * @return The bytes for initialRequestId.
     */
    com.google.protobuf.ByteString
        getInitialRequestIdBytes();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.Events.ResolutionRequestDenialInfo}
   */
  public static final class ResolutionRequestDenialInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.Events.ResolutionRequestDenialInfo)
      ResolutionRequestDenialInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 1,
        /* suffix= */ "",
        ResolutionRequestDenialInfo.class.getName());
    }
    // Use ResolutionRequestDenialInfo.newBuilder() to construct.
    private ResolutionRequestDenialInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private ResolutionRequestDenialInfo() {
      author_ = "";
      initialRequestId_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.internal_static_Diadoc_Api_Proto_Events_ResolutionRequestDenialInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.internal_static_Diadoc_Api_Proto_Events_ResolutionRequestDenialInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo.class, Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo.Builder.class);
    }

    private int bitField0_;
    public static final int AUTHOR_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object author_ = "";
    /**
     * <code>required string Author = 1;</code>
     * @return Whether the author field is set.
     */
    @java.lang.Override
    public boolean hasAuthor() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string Author = 1;</code>
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
     * <code>required string Author = 1;</code>
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

    public static final int INITIALREQUESTID_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object initialRequestId_ = "";
    /**
     * <code>optional string InitialRequestId = 2;</code>
     * @return Whether the initialRequestId field is set.
     */
    @java.lang.Override
    public boolean hasInitialRequestId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string InitialRequestId = 2;</code>
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
     * <code>optional string InitialRequestId = 2;</code>
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
        com.google.protobuf.GeneratedMessage.writeString(output, 1, author_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, initialRequestId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, author_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, initialRequestId_);
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
      if (!(obj instanceof Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo)) {
        return super.equals(obj);
      }
      Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo other = (Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo) obj;

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

    public static Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo parseFrom(
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
    public static Builder newBuilder(Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo prototype) {
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
     * Protobuf type {@code Diadoc.Api.Proto.Events.ResolutionRequestDenialInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.Events.ResolutionRequestDenialInfo)
        Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.internal_static_Diadoc_Api_Proto_Events_ResolutionRequestDenialInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.internal_static_Diadoc_Api_Proto_Events_ResolutionRequestDenialInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo.class, Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo.newBuilder()
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
        author_ = "";
        initialRequestId_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.internal_static_Diadoc_Api_Proto_Events_ResolutionRequestDenialInfo_descriptor;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo getDefaultInstanceForType() {
        return Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo.getDefaultInstance();
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo build() {
        Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo buildPartial() {
        Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo result = new Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.author_ = author_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.initialRequestId_ = initialRequestId_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo) {
          return mergeFrom((Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo other) {
        if (other == Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo.getDefaultInstance()) return this;
        if (other.hasAuthor()) {
          author_ = other.author_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasInitialRequestId()) {
          initialRequestId_ = other.initialRequestId_;
          bitField0_ |= 0x00000002;
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
              case 10: {
                author_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                initialRequestId_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

      private java.lang.Object author_ = "";
      /**
       * <code>required string Author = 1;</code>
       * @return Whether the author field is set.
       */
      public boolean hasAuthor() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string Author = 1;</code>
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
       * <code>required string Author = 1;</code>
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
       * <code>required string Author = 1;</code>
       * @param value The author to set.
       * @return This builder for chaining.
       */
      public Builder setAuthor(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        author_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>required string Author = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuthor() {
        author_ = getDefaultInstance().getAuthor();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>required string Author = 1;</code>
       * @param value The bytes for author to set.
       * @return This builder for chaining.
       */
      public Builder setAuthorBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        author_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object initialRequestId_ = "";
      /**
       * <code>optional string InitialRequestId = 2;</code>
       * @return Whether the initialRequestId field is set.
       */
      public boolean hasInitialRequestId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string InitialRequestId = 2;</code>
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
       * <code>optional string InitialRequestId = 2;</code>
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
       * <code>optional string InitialRequestId = 2;</code>
       * @param value The initialRequestId to set.
       * @return This builder for chaining.
       */
      public Builder setInitialRequestId(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        initialRequestId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>optional string InitialRequestId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearInitialRequestId() {
        initialRequestId_ = getDefaultInstance().getInitialRequestId();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>optional string InitialRequestId = 2;</code>
       * @param value The bytes for initialRequestId to set.
       * @return This builder for chaining.
       */
      public Builder setInitialRequestIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        initialRequestId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.Events.ResolutionRequestDenialInfo)
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.Events.ResolutionRequestDenialInfo)
    private static final Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo();
    }

    public static Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResolutionRequestDenialInfo>
        PARSER = new com.google.protobuf.AbstractParser<ResolutionRequestDenialInfo>() {
      @java.lang.Override
      public ResolutionRequestDenialInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ResolutionRequestDenialInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ResolutionRequestDenialInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public Diadoc.Api.Proto.Events.ResolutionRequestDenialInfoProtos.ResolutionRequestDenialInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_Events_ResolutionRequestDenialInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_Events_ResolutionRequestDenialInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(Events/ResolutionRequestDenialInfo.pro" +
      "to\022\027Diadoc.Api.Proto.Events\"G\n\033Resolutio" +
      "nRequestDenialInfo\022\016\n\006Author\030\001 \002(\t\022\030\n\020In" +
      "itialRequestId\030\002 \001(\tB#B!ResolutionReques" +
      "tDenialInfoProtos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Diadoc_Api_Proto_Events_ResolutionRequestDenialInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_Events_ResolutionRequestDenialInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_Events_ResolutionRequestDenialInfo_descriptor,
        new java.lang.String[] { "Author", "InitialRequestId", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
