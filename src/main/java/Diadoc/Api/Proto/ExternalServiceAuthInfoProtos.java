// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ExternalServiceAuthInfo.proto
// Protobuf Java Version: 4.28.1

package Diadoc.Api.Proto;

public final class ExternalServiceAuthInfoProtos {
  private ExternalServiceAuthInfoProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      ExternalServiceAuthInfoProtos.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ExternalServiceAuthInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.ExternalServiceAuthInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string ServiceUserId = 1;</code>
     * @return Whether the serviceUserId field is set.
     */
    boolean hasServiceUserId();
    /**
     * <code>optional string ServiceUserId = 1;</code>
     * @return The serviceUserId.
     */
    java.lang.String getServiceUserId();
    /**
     * <code>optional string ServiceUserId = 1;</code>
     * @return The bytes for serviceUserId.
     */
    com.google.protobuf.ByteString
        getServiceUserIdBytes();

    /**
     * <code>optional string Thumbprint = 2;</code>
     * @return Whether the thumbprint field is set.
     */
    boolean hasThumbprint();
    /**
     * <code>optional string Thumbprint = 2;</code>
     * @return The thumbprint.
     */
    java.lang.String getThumbprint();
    /**
     * <code>optional string Thumbprint = 2;</code>
     * @return The bytes for thumbprint.
     */
    com.google.protobuf.ByteString
        getThumbprintBytes();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.ExternalServiceAuthInfo}
   */
  public static final class ExternalServiceAuthInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.ExternalServiceAuthInfo)
      ExternalServiceAuthInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 1,
        /* suffix= */ "",
        ExternalServiceAuthInfo.class.getName());
    }
    // Use ExternalServiceAuthInfo.newBuilder() to construct.
    private ExternalServiceAuthInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private ExternalServiceAuthInfo() {
      serviceUserId_ = "";
      thumbprint_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.internal_static_Diadoc_Api_Proto_ExternalServiceAuthInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.internal_static_Diadoc_Api_Proto_ExternalServiceAuthInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo.class, Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo.Builder.class);
    }

    private int bitField0_;
    public static final int SERVICEUSERID_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object serviceUserId_ = "";
    /**
     * <code>optional string ServiceUserId = 1;</code>
     * @return Whether the serviceUserId field is set.
     */
    @java.lang.Override
    public boolean hasServiceUserId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string ServiceUserId = 1;</code>
     * @return The serviceUserId.
     */
    @java.lang.Override
    public java.lang.String getServiceUserId() {
      java.lang.Object ref = serviceUserId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          serviceUserId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string ServiceUserId = 1;</code>
     * @return The bytes for serviceUserId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getServiceUserIdBytes() {
      java.lang.Object ref = serviceUserId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceUserId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int THUMBPRINT_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object thumbprint_ = "";
    /**
     * <code>optional string Thumbprint = 2;</code>
     * @return Whether the thumbprint field is set.
     */
    @java.lang.Override
    public boolean hasThumbprint() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string Thumbprint = 2;</code>
     * @return The thumbprint.
     */
    @java.lang.Override
    public java.lang.String getThumbprint() {
      java.lang.Object ref = thumbprint_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          thumbprint_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string Thumbprint = 2;</code>
     * @return The bytes for thumbprint.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getThumbprintBytes() {
      java.lang.Object ref = thumbprint_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        thumbprint_ = b;
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

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, serviceUserId_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, thumbprint_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, serviceUserId_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, thumbprint_);
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
      if (!(obj instanceof Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo)) {
        return super.equals(obj);
      }
      Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo other = (Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo) obj;

      if (hasServiceUserId() != other.hasServiceUserId()) return false;
      if (hasServiceUserId()) {
        if (!getServiceUserId()
            .equals(other.getServiceUserId())) return false;
      }
      if (hasThumbprint() != other.hasThumbprint()) return false;
      if (hasThumbprint()) {
        if (!getThumbprint()
            .equals(other.getThumbprint())) return false;
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
      if (hasServiceUserId()) {
        hash = (37 * hash) + SERVICEUSERID_FIELD_NUMBER;
        hash = (53 * hash) + getServiceUserId().hashCode();
      }
      if (hasThumbprint()) {
        hash = (37 * hash) + THUMBPRINT_FIELD_NUMBER;
        hash = (53 * hash) + getThumbprint().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo parseFrom(
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
    public static Builder newBuilder(Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo prototype) {
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
     * Protobuf type {@code Diadoc.Api.Proto.ExternalServiceAuthInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.ExternalServiceAuthInfo)
        Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.internal_static_Diadoc_Api_Proto_ExternalServiceAuthInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.internal_static_Diadoc_Api_Proto_ExternalServiceAuthInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo.class, Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo.newBuilder()
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
        serviceUserId_ = "";
        thumbprint_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.internal_static_Diadoc_Api_Proto_ExternalServiceAuthInfo_descriptor;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo getDefaultInstanceForType() {
        return Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo.getDefaultInstance();
      }

      @java.lang.Override
      public Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo build() {
        Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo buildPartial() {
        Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo result = new Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.serviceUserId_ = serviceUserId_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.thumbprint_ = thumbprint_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo) {
          return mergeFrom((Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo other) {
        if (other == Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo.getDefaultInstance()) return this;
        if (other.hasServiceUserId()) {
          serviceUserId_ = other.serviceUserId_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasThumbprint()) {
          thumbprint_ = other.thumbprint_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
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
                serviceUserId_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                thumbprint_ = input.readBytes();
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

      private java.lang.Object serviceUserId_ = "";
      /**
       * <code>optional string ServiceUserId = 1;</code>
       * @return Whether the serviceUserId field is set.
       */
      public boolean hasServiceUserId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string ServiceUserId = 1;</code>
       * @return The serviceUserId.
       */
      public java.lang.String getServiceUserId() {
        java.lang.Object ref = serviceUserId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            serviceUserId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string ServiceUserId = 1;</code>
       * @return The bytes for serviceUserId.
       */
      public com.google.protobuf.ByteString
          getServiceUserIdBytes() {
        java.lang.Object ref = serviceUserId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          serviceUserId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string ServiceUserId = 1;</code>
       * @param value The serviceUserId to set.
       * @return This builder for chaining.
       */
      public Builder setServiceUserId(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        serviceUserId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional string ServiceUserId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearServiceUserId() {
        serviceUserId_ = getDefaultInstance().getServiceUserId();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>optional string ServiceUserId = 1;</code>
       * @param value The bytes for serviceUserId to set.
       * @return This builder for chaining.
       */
      public Builder setServiceUserIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        serviceUserId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object thumbprint_ = "";
      /**
       * <code>optional string Thumbprint = 2;</code>
       * @return Whether the thumbprint field is set.
       */
      public boolean hasThumbprint() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string Thumbprint = 2;</code>
       * @return The thumbprint.
       */
      public java.lang.String getThumbprint() {
        java.lang.Object ref = thumbprint_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            thumbprint_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string Thumbprint = 2;</code>
       * @return The bytes for thumbprint.
       */
      public com.google.protobuf.ByteString
          getThumbprintBytes() {
        java.lang.Object ref = thumbprint_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          thumbprint_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string Thumbprint = 2;</code>
       * @param value The thumbprint to set.
       * @return This builder for chaining.
       */
      public Builder setThumbprint(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        thumbprint_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>optional string Thumbprint = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearThumbprint() {
        thumbprint_ = getDefaultInstance().getThumbprint();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>optional string Thumbprint = 2;</code>
       * @param value The bytes for thumbprint to set.
       * @return This builder for chaining.
       */
      public Builder setThumbprintBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        thumbprint_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.ExternalServiceAuthInfo)
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.ExternalServiceAuthInfo)
    private static final Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo();
    }

    public static Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ExternalServiceAuthInfo>
        PARSER = new com.google.protobuf.AbstractParser<ExternalServiceAuthInfo>() {
      @java.lang.Override
      public ExternalServiceAuthInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ExternalServiceAuthInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExternalServiceAuthInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_ExternalServiceAuthInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_ExternalServiceAuthInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ExternalServiceAuthInfo.proto\022\020Diadoc." +
      "Api.Proto\"D\n\027ExternalServiceAuthInfo\022\025\n\r" +
      "ServiceUserId\030\001 \001(\t\022\022\n\nThumbprint\030\002 \001(\tB" +
      "\037B\035ExternalServiceAuthInfoProtos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Diadoc_Api_Proto_ExternalServiceAuthInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_ExternalServiceAuthInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_ExternalServiceAuthInfo_descriptor,
        new java.lang.String[] { "ServiceUserId", "Thumbprint", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
