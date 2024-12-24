// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: Docflow/RecipientSignatureDocflow.proto
// Protobuf Java Version: 4.28.1

package Diadoc.Api.Proto.Docflow;

public final class RecipientSignatureDocflowProtos {
  private RecipientSignatureDocflowProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      RecipientSignatureDocflowProtos.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  @java.lang.Deprecated public interface RecipientSignatureDocflowOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.Docflow.RecipientSignatureDocflow)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bool IsFinished = 1;</code>
     * @return Whether the isFinished field is set.
     */
    boolean hasIsFinished();
    /**
     * <code>optional bool IsFinished = 1;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();

    /**
     * <code>optional .Diadoc.Api.Proto.Docflow.Signature RecipientSignature = 2;</code>
     * @return Whether the recipientSignature field is set.
     */
    boolean hasRecipientSignature();
    /**
     * <code>optional .Diadoc.Api.Proto.Docflow.Signature RecipientSignature = 2;</code>
     * @return The recipientSignature.
     */
    Diadoc.Api.Proto.Docflow.AttachmentProtos.Signature getRecipientSignature();
    /**
     * <code>optional .Diadoc.Api.Proto.Docflow.Signature RecipientSignature = 2;</code>
     */
    Diadoc.Api.Proto.Docflow.AttachmentProtos.SignatureOrBuilder getRecipientSignatureOrBuilder();

    /**
     * <code>optional .Diadoc.Api.Proto.Timestamp DeliveryTimestamp = 3;</code>
     * @return Whether the deliveryTimestamp field is set.
     */
    boolean hasDeliveryTimestamp();
    /**
     * <code>optional .Diadoc.Api.Proto.Timestamp DeliveryTimestamp = 3;</code>
     * @return The deliveryTimestamp.
     */
    Diadoc.Api.Proto.TimestampProtos.Timestamp getDeliveryTimestamp();
    /**
     * <code>optional .Diadoc.Api.Proto.Timestamp DeliveryTimestamp = 3;</code>
     */
    Diadoc.Api.Proto.TimestampProtos.TimestampOrBuilder getDeliveryTimestampOrBuilder();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.Docflow.RecipientSignatureDocflow}
   */
  @java.lang.Deprecated public static final class RecipientSignatureDocflow extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.Docflow.RecipientSignatureDocflow)
      RecipientSignatureDocflowOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 1,
        /* suffix= */ "",
        RecipientSignatureDocflow.class.getName());
    }
    // Use RecipientSignatureDocflow.newBuilder() to construct.
    private RecipientSignatureDocflow(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private RecipientSignatureDocflow() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.internal_static_Diadoc_Api_Proto_Docflow_RecipientSignatureDocflow_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.internal_static_Diadoc_Api_Proto_Docflow_RecipientSignatureDocflow_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow.class, Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow.Builder.class);
    }

    private int bitField0_;
    public static final int ISFINISHED_FIELD_NUMBER = 1;
    private boolean isFinished_ = false;
    /**
     * <code>optional bool IsFinished = 1;</code>
     * @return Whether the isFinished field is set.
     */
    @java.lang.Override
    public boolean hasIsFinished() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bool IsFinished = 1;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int RECIPIENTSIGNATURE_FIELD_NUMBER = 2;
    private Diadoc.Api.Proto.Docflow.AttachmentProtos.Signature recipientSignature_;
    /**
     * <code>optional .Diadoc.Api.Proto.Docflow.Signature RecipientSignature = 2;</code>
     * @return Whether the recipientSignature field is set.
     */
    @java.lang.Override
    public boolean hasRecipientSignature() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .Diadoc.Api.Proto.Docflow.Signature RecipientSignature = 2;</code>
     * @return The recipientSignature.
     */
    @java.lang.Override
    public Diadoc.Api.Proto.Docflow.AttachmentProtos.Signature getRecipientSignature() {
      return recipientSignature_ == null ? Diadoc.Api.Proto.Docflow.AttachmentProtos.Signature.getDefaultInstance() : recipientSignature_;
    }
    /**
     * <code>optional .Diadoc.Api.Proto.Docflow.Signature RecipientSignature = 2;</code>
     */
    @java.lang.Override
    public Diadoc.Api.Proto.Docflow.AttachmentProtos.SignatureOrBuilder getRecipientSignatureOrBuilder() {
      return recipientSignature_ == null ? Diadoc.Api.Proto.Docflow.AttachmentProtos.Signature.getDefaultInstance() : recipientSignature_;
    }

    public static final int DELIVERYTIMESTAMP_FIELD_NUMBER = 3;
    private Diadoc.Api.Proto.TimestampProtos.Timestamp deliveryTimestamp_;
    /**
     * <code>optional .Diadoc.Api.Proto.Timestamp DeliveryTimestamp = 3;</code>
     * @return Whether the deliveryTimestamp field is set.
     */
    @java.lang.Override
    public boolean hasDeliveryTimestamp() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .Diadoc.Api.Proto.Timestamp DeliveryTimestamp = 3;</code>
     * @return The deliveryTimestamp.
     */
    @java.lang.Override
    public Diadoc.Api.Proto.TimestampProtos.Timestamp getDeliveryTimestamp() {
      return deliveryTimestamp_ == null ? Diadoc.Api.Proto.TimestampProtos.Timestamp.getDefaultInstance() : deliveryTimestamp_;
    }
    /**
     * <code>optional .Diadoc.Api.Proto.Timestamp DeliveryTimestamp = 3;</code>
     */
    @java.lang.Override
    public Diadoc.Api.Proto.TimestampProtos.TimestampOrBuilder getDeliveryTimestampOrBuilder() {
      return deliveryTimestamp_ == null ? Diadoc.Api.Proto.TimestampProtos.Timestamp.getDefaultInstance() : deliveryTimestamp_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (hasRecipientSignature()) {
        if (!getRecipientSignature().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasDeliveryTimestamp()) {
        if (!getDeliveryTimestamp().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeBool(1, isFinished_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(2, getRecipientSignature());
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeMessage(3, getDeliveryTimestamp());
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
          .computeBoolSize(1, isFinished_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getRecipientSignature());
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getDeliveryTimestamp());
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
      if (!(obj instanceof Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow)) {
        return super.equals(obj);
      }
      Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow other = (Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow) obj;

      if (hasIsFinished() != other.hasIsFinished()) return false;
      if (hasIsFinished()) {
        if (getIsFinished()
            != other.getIsFinished()) return false;
      }
      if (hasRecipientSignature() != other.hasRecipientSignature()) return false;
      if (hasRecipientSignature()) {
        if (!getRecipientSignature()
            .equals(other.getRecipientSignature())) return false;
      }
      if (hasDeliveryTimestamp() != other.hasDeliveryTimestamp()) return false;
      if (hasDeliveryTimestamp()) {
        if (!getDeliveryTimestamp()
            .equals(other.getDeliveryTimestamp())) return false;
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
      if (hasIsFinished()) {
        hash = (37 * hash) + ISFINISHED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getIsFinished());
      }
      if (hasRecipientSignature()) {
        hash = (37 * hash) + RECIPIENTSIGNATURE_FIELD_NUMBER;
        hash = (53 * hash) + getRecipientSignature().hashCode();
      }
      if (hasDeliveryTimestamp()) {
        hash = (37 * hash) + DELIVERYTIMESTAMP_FIELD_NUMBER;
        hash = (53 * hash) + getDeliveryTimestamp().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow parseFrom(
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
    public static Builder newBuilder(Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow prototype) {
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
     * Protobuf type {@code Diadoc.Api.Proto.Docflow.RecipientSignatureDocflow}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.Docflow.RecipientSignatureDocflow)
        Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflowOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.internal_static_Diadoc_Api_Proto_Docflow_RecipientSignatureDocflow_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.internal_static_Diadoc_Api_Proto_Docflow_RecipientSignatureDocflow_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow.class, Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage
                .alwaysUseFieldBuilders) {
          getRecipientSignatureFieldBuilder();
          getDeliveryTimestampFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        isFinished_ = false;
        recipientSignature_ = null;
        if (recipientSignatureBuilder_ != null) {
          recipientSignatureBuilder_.dispose();
          recipientSignatureBuilder_ = null;
        }
        deliveryTimestamp_ = null;
        if (deliveryTimestampBuilder_ != null) {
          deliveryTimestampBuilder_.dispose();
          deliveryTimestampBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.internal_static_Diadoc_Api_Proto_Docflow_RecipientSignatureDocflow_descriptor;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow getDefaultInstanceForType() {
        return Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow.getDefaultInstance();
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow build() {
        Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow buildPartial() {
        Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow result = new Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isFinished_ = isFinished_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.recipientSignature_ = recipientSignatureBuilder_ == null
              ? recipientSignature_
              : recipientSignatureBuilder_.build();
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.deliveryTimestamp_ = deliveryTimestampBuilder_ == null
              ? deliveryTimestamp_
              : deliveryTimestampBuilder_.build();
          to_bitField0_ |= 0x00000004;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow) {
          return mergeFrom((Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow other) {
        if (other == Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow.getDefaultInstance()) return this;
        if (other.hasIsFinished()) {
          setIsFinished(other.getIsFinished());
        }
        if (other.hasRecipientSignature()) {
          mergeRecipientSignature(other.getRecipientSignature());
        }
        if (other.hasDeliveryTimestamp()) {
          mergeDeliveryTimestamp(other.getDeliveryTimestamp());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (hasRecipientSignature()) {
          if (!getRecipientSignature().isInitialized()) {
            return false;
          }
        }
        if (hasDeliveryTimestamp()) {
          if (!getDeliveryTimestamp().isInitialized()) {
            return false;
          }
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
                isFinished_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                input.readMessage(
                    getRecipientSignatureFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                input.readMessage(
                    getDeliveryTimestampFieldBuilder().getBuilder(),
                    extensionRegistry);
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

      private boolean isFinished_ ;
      /**
       * <code>optional bool IsFinished = 1;</code>
       * @return Whether the isFinished field is set.
       */
      @java.lang.Override
      public boolean hasIsFinished() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional bool IsFinished = 1;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>optional bool IsFinished = 1;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {

        isFinished_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool IsFinished = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isFinished_ = false;
        onChanged();
        return this;
      }

      private Diadoc.Api.Proto.Docflow.AttachmentProtos.Signature recipientSignature_;
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.Docflow.AttachmentProtos.Signature, Diadoc.Api.Proto.Docflow.AttachmentProtos.Signature.Builder, Diadoc.Api.Proto.Docflow.AttachmentProtos.SignatureOrBuilder> recipientSignatureBuilder_;
      /**
       * <code>optional .Diadoc.Api.Proto.Docflow.Signature RecipientSignature = 2;</code>
       * @return Whether the recipientSignature field is set.
       */
      public boolean hasRecipientSignature() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Docflow.Signature RecipientSignature = 2;</code>
       * @return The recipientSignature.
       */
      public Diadoc.Api.Proto.Docflow.AttachmentProtos.Signature getRecipientSignature() {
        if (recipientSignatureBuilder_ == null) {
          return recipientSignature_ == null ? Diadoc.Api.Proto.Docflow.AttachmentProtos.Signature.getDefaultInstance() : recipientSignature_;
        } else {
          return recipientSignatureBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Docflow.Signature RecipientSignature = 2;</code>
       */
      public Builder setRecipientSignature(Diadoc.Api.Proto.Docflow.AttachmentProtos.Signature value) {
        if (recipientSignatureBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          recipientSignature_ = value;
        } else {
          recipientSignatureBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Docflow.Signature RecipientSignature = 2;</code>
       */
      public Builder setRecipientSignature(
          Diadoc.Api.Proto.Docflow.AttachmentProtos.Signature.Builder builderForValue) {
        if (recipientSignatureBuilder_ == null) {
          recipientSignature_ = builderForValue.build();
        } else {
          recipientSignatureBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Docflow.Signature RecipientSignature = 2;</code>
       */
      public Builder mergeRecipientSignature(Diadoc.Api.Proto.Docflow.AttachmentProtos.Signature value) {
        if (recipientSignatureBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            recipientSignature_ != null &&
            recipientSignature_ != Diadoc.Api.Proto.Docflow.AttachmentProtos.Signature.getDefaultInstance()) {
            getRecipientSignatureBuilder().mergeFrom(value);
          } else {
            recipientSignature_ = value;
          }
        } else {
          recipientSignatureBuilder_.mergeFrom(value);
        }
        if (recipientSignature_ != null) {
          bitField0_ |= 0x00000002;
          onChanged();
        }
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Docflow.Signature RecipientSignature = 2;</code>
       */
      public Builder clearRecipientSignature() {
        bitField0_ = (bitField0_ & ~0x00000002);
        recipientSignature_ = null;
        if (recipientSignatureBuilder_ != null) {
          recipientSignatureBuilder_.dispose();
          recipientSignatureBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Docflow.Signature RecipientSignature = 2;</code>
       */
      public Diadoc.Api.Proto.Docflow.AttachmentProtos.Signature.Builder getRecipientSignatureBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getRecipientSignatureFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Docflow.Signature RecipientSignature = 2;</code>
       */
      public Diadoc.Api.Proto.Docflow.AttachmentProtos.SignatureOrBuilder getRecipientSignatureOrBuilder() {
        if (recipientSignatureBuilder_ != null) {
          return recipientSignatureBuilder_.getMessageOrBuilder();
        } else {
          return recipientSignature_ == null ?
              Diadoc.Api.Proto.Docflow.AttachmentProtos.Signature.getDefaultInstance() : recipientSignature_;
        }
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Docflow.Signature RecipientSignature = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.Docflow.AttachmentProtos.Signature, Diadoc.Api.Proto.Docflow.AttachmentProtos.Signature.Builder, Diadoc.Api.Proto.Docflow.AttachmentProtos.SignatureOrBuilder> 
          getRecipientSignatureFieldBuilder() {
        if (recipientSignatureBuilder_ == null) {
          recipientSignatureBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              Diadoc.Api.Proto.Docflow.AttachmentProtos.Signature, Diadoc.Api.Proto.Docflow.AttachmentProtos.Signature.Builder, Diadoc.Api.Proto.Docflow.AttachmentProtos.SignatureOrBuilder>(
                  getRecipientSignature(),
                  getParentForChildren(),
                  isClean());
          recipientSignature_ = null;
        }
        return recipientSignatureBuilder_;
      }

      private Diadoc.Api.Proto.TimestampProtos.Timestamp deliveryTimestamp_;
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.TimestampProtos.Timestamp, Diadoc.Api.Proto.TimestampProtos.Timestamp.Builder, Diadoc.Api.Proto.TimestampProtos.TimestampOrBuilder> deliveryTimestampBuilder_;
      /**
       * <code>optional .Diadoc.Api.Proto.Timestamp DeliveryTimestamp = 3;</code>
       * @return Whether the deliveryTimestamp field is set.
       */
      public boolean hasDeliveryTimestamp() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Timestamp DeliveryTimestamp = 3;</code>
       * @return The deliveryTimestamp.
       */
      public Diadoc.Api.Proto.TimestampProtos.Timestamp getDeliveryTimestamp() {
        if (deliveryTimestampBuilder_ == null) {
          return deliveryTimestamp_ == null ? Diadoc.Api.Proto.TimestampProtos.Timestamp.getDefaultInstance() : deliveryTimestamp_;
        } else {
          return deliveryTimestampBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Timestamp DeliveryTimestamp = 3;</code>
       */
      public Builder setDeliveryTimestamp(Diadoc.Api.Proto.TimestampProtos.Timestamp value) {
        if (deliveryTimestampBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          deliveryTimestamp_ = value;
        } else {
          deliveryTimestampBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Timestamp DeliveryTimestamp = 3;</code>
       */
      public Builder setDeliveryTimestamp(
          Diadoc.Api.Proto.TimestampProtos.Timestamp.Builder builderForValue) {
        if (deliveryTimestampBuilder_ == null) {
          deliveryTimestamp_ = builderForValue.build();
        } else {
          deliveryTimestampBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Timestamp DeliveryTimestamp = 3;</code>
       */
      public Builder mergeDeliveryTimestamp(Diadoc.Api.Proto.TimestampProtos.Timestamp value) {
        if (deliveryTimestampBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            deliveryTimestamp_ != null &&
            deliveryTimestamp_ != Diadoc.Api.Proto.TimestampProtos.Timestamp.getDefaultInstance()) {
            getDeliveryTimestampBuilder().mergeFrom(value);
          } else {
            deliveryTimestamp_ = value;
          }
        } else {
          deliveryTimestampBuilder_.mergeFrom(value);
        }
        if (deliveryTimestamp_ != null) {
          bitField0_ |= 0x00000004;
          onChanged();
        }
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Timestamp DeliveryTimestamp = 3;</code>
       */
      public Builder clearDeliveryTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000004);
        deliveryTimestamp_ = null;
        if (deliveryTimestampBuilder_ != null) {
          deliveryTimestampBuilder_.dispose();
          deliveryTimestampBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Timestamp DeliveryTimestamp = 3;</code>
       */
      public Diadoc.Api.Proto.TimestampProtos.Timestamp.Builder getDeliveryTimestampBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getDeliveryTimestampFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Timestamp DeliveryTimestamp = 3;</code>
       */
      public Diadoc.Api.Proto.TimestampProtos.TimestampOrBuilder getDeliveryTimestampOrBuilder() {
        if (deliveryTimestampBuilder_ != null) {
          return deliveryTimestampBuilder_.getMessageOrBuilder();
        } else {
          return deliveryTimestamp_ == null ?
              Diadoc.Api.Proto.TimestampProtos.Timestamp.getDefaultInstance() : deliveryTimestamp_;
        }
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Timestamp DeliveryTimestamp = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.TimestampProtos.Timestamp, Diadoc.Api.Proto.TimestampProtos.Timestamp.Builder, Diadoc.Api.Proto.TimestampProtos.TimestampOrBuilder> 
          getDeliveryTimestampFieldBuilder() {
        if (deliveryTimestampBuilder_ == null) {
          deliveryTimestampBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              Diadoc.Api.Proto.TimestampProtos.Timestamp, Diadoc.Api.Proto.TimestampProtos.Timestamp.Builder, Diadoc.Api.Proto.TimestampProtos.TimestampOrBuilder>(
                  getDeliveryTimestamp(),
                  getParentForChildren(),
                  isClean());
          deliveryTimestamp_ = null;
        }
        return deliveryTimestampBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.Docflow.RecipientSignatureDocflow)
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.Docflow.RecipientSignatureDocflow)
    private static final Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow();
    }

    public static Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RecipientSignatureDocflow>
        PARSER = new com.google.protobuf.AbstractParser<RecipientSignatureDocflow>() {
      @java.lang.Override
      public RecipientSignatureDocflow parsePartialFrom(
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

    public static com.google.protobuf.Parser<RecipientSignatureDocflow> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RecipientSignatureDocflow> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public Diadoc.Api.Proto.Docflow.RecipientSignatureDocflowProtos.RecipientSignatureDocflow getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_Docflow_RecipientSignatureDocflow_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_Docflow_RecipientSignatureDocflow_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'Docflow/RecipientSignatureDocflow.prot" +
      "o\022\030Diadoc.Api.Proto.Docflow\032\017Timestamp.p" +
      "roto\032\030Docflow/Attachment.proto\"\254\001\n\031Recip" +
      "ientSignatureDocflow\022\022\n\nIsFinished\030\001 \001(\010" +
      "\022?\n\022RecipientSignature\030\002 \001(\0132#.Diadoc.Ap" +
      "i.Proto.Docflow.Signature\0226\n\021DeliveryTim" +
      "estamp\030\003 \001(\0132\033.Diadoc.Api.Proto.Timestam" +
      "p:\002\030\001B!B\037RecipientSignatureDocflowProtos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          Diadoc.Api.Proto.TimestampProtos.getDescriptor(),
          Diadoc.Api.Proto.Docflow.AttachmentProtos.getDescriptor(),
        });
    internal_static_Diadoc_Api_Proto_Docflow_RecipientSignatureDocflow_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_Docflow_RecipientSignatureDocflow_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_Docflow_RecipientSignatureDocflow_descriptor,
        new java.lang.String[] { "IsFinished", "RecipientSignature", "DeliveryTimestamp", });
    descriptor.resolveAllFeaturesImmutable();
    Diadoc.Api.Proto.TimestampProtos.getDescriptor();
    Diadoc.Api.Proto.Docflow.AttachmentProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
