// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: Organizations/ManualBlockStatus.proto
// Protobuf Java Version: 4.28.1

package Diadoc.Api.Proto.Organizations;

public final class ManualBlockStatusProtos {
  private ManualBlockStatusProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      ManualBlockStatusProtos.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ManualBlockStatusOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.Organizations.ManualBlockStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required bool IsBlocked = 1;</code>
     * @return Whether the isBlocked field is set.
     */
    boolean hasIsBlocked();
    /**
     * <code>required bool IsBlocked = 1;</code>
     * @return The isBlocked.
     */
    boolean getIsBlocked();

    /**
     * <code>optional sfixed64 RequestedTicks = 2;</code>
     * @return Whether the requestedTicks field is set.
     */
    boolean hasRequestedTicks();
    /**
     * <code>optional sfixed64 RequestedTicks = 2;</code>
     * @return The requestedTicks.
     */
    long getRequestedTicks();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.Organizations.ManualBlockStatus}
   */
  public static final class ManualBlockStatus extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.Organizations.ManualBlockStatus)
      ManualBlockStatusOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 1,
        /* suffix= */ "",
        ManualBlockStatus.class.getName());
    }
    // Use ManualBlockStatus.newBuilder() to construct.
    private ManualBlockStatus(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private ManualBlockStatus() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.internal_static_Diadoc_Api_Proto_Organizations_ManualBlockStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.internal_static_Diadoc_Api_Proto_Organizations_ManualBlockStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus.class, Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus.Builder.class);
    }

    private int bitField0_;
    public static final int ISBLOCKED_FIELD_NUMBER = 1;
    private boolean isBlocked_ = false;
    /**
     * <code>required bool IsBlocked = 1;</code>
     * @return Whether the isBlocked field is set.
     */
    @java.lang.Override
    public boolean hasIsBlocked() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required bool IsBlocked = 1;</code>
     * @return The isBlocked.
     */
    @java.lang.Override
    public boolean getIsBlocked() {
      return isBlocked_;
    }

    public static final int REQUESTEDTICKS_FIELD_NUMBER = 2;
    private long requestedTicks_ = 0L;
    /**
     * <code>optional sfixed64 RequestedTicks = 2;</code>
     * @return Whether the requestedTicks field is set.
     */
    @java.lang.Override
    public boolean hasRequestedTicks() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional sfixed64 RequestedTicks = 2;</code>
     * @return The requestedTicks.
     */
    @java.lang.Override
    public long getRequestedTicks() {
      return requestedTicks_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasIsBlocked()) {
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
        output.writeBool(1, isBlocked_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeSFixed64(2, requestedTicks_);
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
          .computeBoolSize(1, isBlocked_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeSFixed64Size(2, requestedTicks_);
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
      if (!(obj instanceof Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus)) {
        return super.equals(obj);
      }
      Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus other = (Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus) obj;

      if (hasIsBlocked() != other.hasIsBlocked()) return false;
      if (hasIsBlocked()) {
        if (getIsBlocked()
            != other.getIsBlocked()) return false;
      }
      if (hasRequestedTicks() != other.hasRequestedTicks()) return false;
      if (hasRequestedTicks()) {
        if (getRequestedTicks()
            != other.getRequestedTicks()) return false;
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
      if (hasIsBlocked()) {
        hash = (37 * hash) + ISBLOCKED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getIsBlocked());
      }
      if (hasRequestedTicks()) {
        hash = (37 * hash) + REQUESTEDTICKS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getRequestedTicks());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus parseFrom(
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
    public static Builder newBuilder(Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus prototype) {
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
     * Protobuf type {@code Diadoc.Api.Proto.Organizations.ManualBlockStatus}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.Organizations.ManualBlockStatus)
        Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.internal_static_Diadoc_Api_Proto_Organizations_ManualBlockStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.internal_static_Diadoc_Api_Proto_Organizations_ManualBlockStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus.class, Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus.newBuilder()
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
        isBlocked_ = false;
        requestedTicks_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.internal_static_Diadoc_Api_Proto_Organizations_ManualBlockStatus_descriptor;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus getDefaultInstanceForType() {
        return Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus.getDefaultInstance();
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus build() {
        Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus buildPartial() {
        Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus result = new Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isBlocked_ = isBlocked_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.requestedTicks_ = requestedTicks_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus) {
          return mergeFrom((Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus other) {
        if (other == Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus.getDefaultInstance()) return this;
        if (other.hasIsBlocked()) {
          setIsBlocked(other.getIsBlocked());
        }
        if (other.hasRequestedTicks()) {
          setRequestedTicks(other.getRequestedTicks());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasIsBlocked()) {
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
                isBlocked_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 17: {
                requestedTicks_ = input.readSFixed64();
                bitField0_ |= 0x00000002;
                break;
              } // case 17
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

      private boolean isBlocked_ ;
      /**
       * <code>required bool IsBlocked = 1;</code>
       * @return Whether the isBlocked field is set.
       */
      @java.lang.Override
      public boolean hasIsBlocked() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required bool IsBlocked = 1;</code>
       * @return The isBlocked.
       */
      @java.lang.Override
      public boolean getIsBlocked() {
        return isBlocked_;
      }
      /**
       * <code>required bool IsBlocked = 1;</code>
       * @param value The isBlocked to set.
       * @return This builder for chaining.
       */
      public Builder setIsBlocked(boolean value) {

        isBlocked_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>required bool IsBlocked = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsBlocked() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isBlocked_ = false;
        onChanged();
        return this;
      }

      private long requestedTicks_ ;
      /**
       * <code>optional sfixed64 RequestedTicks = 2;</code>
       * @return Whether the requestedTicks field is set.
       */
      @java.lang.Override
      public boolean hasRequestedTicks() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional sfixed64 RequestedTicks = 2;</code>
       * @return The requestedTicks.
       */
      @java.lang.Override
      public long getRequestedTicks() {
        return requestedTicks_;
      }
      /**
       * <code>optional sfixed64 RequestedTicks = 2;</code>
       * @param value The requestedTicks to set.
       * @return This builder for chaining.
       */
      public Builder setRequestedTicks(long value) {

        requestedTicks_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>optional sfixed64 RequestedTicks = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRequestedTicks() {
        bitField0_ = (bitField0_ & ~0x00000002);
        requestedTicks_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.Organizations.ManualBlockStatus)
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.Organizations.ManualBlockStatus)
    private static final Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus();
    }

    public static Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ManualBlockStatus>
        PARSER = new com.google.protobuf.AbstractParser<ManualBlockStatus>() {
      @java.lang.Override
      public ManualBlockStatus parsePartialFrom(
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

    public static com.google.protobuf.Parser<ManualBlockStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ManualBlockStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public Diadoc.Api.Proto.Organizations.ManualBlockStatusProtos.ManualBlockStatus getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_Organizations_ManualBlockStatus_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_Organizations_ManualBlockStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%Organizations/ManualBlockStatus.proto\022" +
      "\036Diadoc.Api.Proto.Organizations\">\n\021Manua" +
      "lBlockStatus\022\021\n\tIsBlocked\030\001 \002(\010\022\026\n\016Reque" +
      "stedTicks\030\002 \001(\020B\031B\027ManualBlockStatusProt" +
      "os"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Diadoc_Api_Proto_Organizations_ManualBlockStatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_Organizations_ManualBlockStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_Organizations_ManualBlockStatus_descriptor,
        new java.lang.String[] { "IsBlocked", "RequestedTicks", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
