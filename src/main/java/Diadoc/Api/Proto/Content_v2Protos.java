// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: Content_v2.proto
// Protobuf Java Version: 4.28.1

package Diadoc.Api.Proto;

public final class Content_v2Protos {
  private Content_v2Protos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      Content_v2Protos.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Content_v2OrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.Content_v2)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bytes Content = 1;</code>
     * @return Whether the content field is set.
     */
    boolean hasContent();
    /**
     * <code>optional bytes Content = 1;</code>
     * @return The content.
     */
    com.google.protobuf.ByteString getContent();

    /**
     * <code>optional string NameOnShelf = 2;</code>
     * @return Whether the nameOnShelf field is set.
     */
    boolean hasNameOnShelf();
    /**
     * <code>optional string NameOnShelf = 2;</code>
     * @return The nameOnShelf.
     */
    java.lang.String getNameOnShelf();
    /**
     * <code>optional string NameOnShelf = 2;</code>
     * @return The bytes for nameOnShelf.
     */
    com.google.protobuf.ByteString
        getNameOnShelfBytes();

    /**
     * <code>optional string PatchedContentId = 3;</code>
     * @return Whether the patchedContentId field is set.
     */
    boolean hasPatchedContentId();
    /**
     * <code>optional string PatchedContentId = 3;</code>
     * @return The patchedContentId.
     */
    java.lang.String getPatchedContentId();
    /**
     * <code>optional string PatchedContentId = 3;</code>
     * @return The bytes for patchedContentId.
     */
    com.google.protobuf.ByteString
        getPatchedContentIdBytes();

    /**
     * <code>optional .Diadoc.Api.Proto.DocumentIdEx DocumentId = 4;</code>
     * @return Whether the documentId field is set.
     */
    boolean hasDocumentId();
    /**
     * <code>optional .Diadoc.Api.Proto.DocumentIdEx DocumentId = 4;</code>
     * @return The documentId.
     */
    Diadoc.Api.Proto.DocumentIdProtos.DocumentIdEx getDocumentId();
    /**
     * <code>optional .Diadoc.Api.Proto.DocumentIdEx DocumentId = 4;</code>
     */
    Diadoc.Api.Proto.DocumentIdProtos.DocumentIdExOrBuilder getDocumentIdOrBuilder();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.Content_v2}
   */
  public static final class Content_v2 extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.Content_v2)
      Content_v2OrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 1,
        /* suffix= */ "",
        Content_v2.class.getName());
    }
    // Use Content_v2.newBuilder() to construct.
    private Content_v2(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private Content_v2() {
      content_ = com.google.protobuf.ByteString.EMPTY;
      nameOnShelf_ = "";
      patchedContentId_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.Content_v2Protos.internal_static_Diadoc_Api_Proto_Content_v2_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.Content_v2Protos.internal_static_Diadoc_Api_Proto_Content_v2_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.Content_v2Protos.Content_v2.class, Diadoc.Api.Proto.Content_v2Protos.Content_v2.Builder.class);
    }

    private int bitField0_;
    public static final int CONTENT_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes Content = 1;</code>
     * @return Whether the content field is set.
     */
    @java.lang.Override
    public boolean hasContent() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional bytes Content = 1;</code>
     * @return The content.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getContent() {
      return content_;
    }

    public static final int NAMEONSHELF_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object nameOnShelf_ = "";
    /**
     * <code>optional string NameOnShelf = 2;</code>
     * @return Whether the nameOnShelf field is set.
     */
    @java.lang.Override
    public boolean hasNameOnShelf() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string NameOnShelf = 2;</code>
     * @return The nameOnShelf.
     */
    @java.lang.Override
    public java.lang.String getNameOnShelf() {
      java.lang.Object ref = nameOnShelf_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          nameOnShelf_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string NameOnShelf = 2;</code>
     * @return The bytes for nameOnShelf.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameOnShelfBytes() {
      java.lang.Object ref = nameOnShelf_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nameOnShelf_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PATCHEDCONTENTID_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object patchedContentId_ = "";
    /**
     * <code>optional string PatchedContentId = 3;</code>
     * @return Whether the patchedContentId field is set.
     */
    @java.lang.Override
    public boolean hasPatchedContentId() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string PatchedContentId = 3;</code>
     * @return The patchedContentId.
     */
    @java.lang.Override
    public java.lang.String getPatchedContentId() {
      java.lang.Object ref = patchedContentId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          patchedContentId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string PatchedContentId = 3;</code>
     * @return The bytes for patchedContentId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPatchedContentIdBytes() {
      java.lang.Object ref = patchedContentId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        patchedContentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DOCUMENTID_FIELD_NUMBER = 4;
    private Diadoc.Api.Proto.DocumentIdProtos.DocumentIdEx documentId_;
    /**
     * <code>optional .Diadoc.Api.Proto.DocumentIdEx DocumentId = 4;</code>
     * @return Whether the documentId field is set.
     */
    @java.lang.Override
    public boolean hasDocumentId() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional .Diadoc.Api.Proto.DocumentIdEx DocumentId = 4;</code>
     * @return The documentId.
     */
    @java.lang.Override
    public Diadoc.Api.Proto.DocumentIdProtos.DocumentIdEx getDocumentId() {
      return documentId_ == null ? Diadoc.Api.Proto.DocumentIdProtos.DocumentIdEx.getDefaultInstance() : documentId_;
    }
    /**
     * <code>optional .Diadoc.Api.Proto.DocumentIdEx DocumentId = 4;</code>
     */
    @java.lang.Override
    public Diadoc.Api.Proto.DocumentIdProtos.DocumentIdExOrBuilder getDocumentIdOrBuilder() {
      return documentId_ == null ? Diadoc.Api.Proto.DocumentIdProtos.DocumentIdEx.getDefaultInstance() : documentId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (hasDocumentId()) {
        if (!getDocumentId().isInitialized()) {
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
        output.writeBytes(1, content_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, nameOnShelf_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 3, patchedContentId_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeMessage(4, getDocumentId());
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
          .computeBytesSize(1, content_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, nameOnShelf_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(3, patchedContentId_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getDocumentId());
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
      if (!(obj instanceof Diadoc.Api.Proto.Content_v2Protos.Content_v2)) {
        return super.equals(obj);
      }
      Diadoc.Api.Proto.Content_v2Protos.Content_v2 other = (Diadoc.Api.Proto.Content_v2Protos.Content_v2) obj;

      if (hasContent() != other.hasContent()) return false;
      if (hasContent()) {
        if (!getContent()
            .equals(other.getContent())) return false;
      }
      if (hasNameOnShelf() != other.hasNameOnShelf()) return false;
      if (hasNameOnShelf()) {
        if (!getNameOnShelf()
            .equals(other.getNameOnShelf())) return false;
      }
      if (hasPatchedContentId() != other.hasPatchedContentId()) return false;
      if (hasPatchedContentId()) {
        if (!getPatchedContentId()
            .equals(other.getPatchedContentId())) return false;
      }
      if (hasDocumentId() != other.hasDocumentId()) return false;
      if (hasDocumentId()) {
        if (!getDocumentId()
            .equals(other.getDocumentId())) return false;
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
      if (hasContent()) {
        hash = (37 * hash) + CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getContent().hashCode();
      }
      if (hasNameOnShelf()) {
        hash = (37 * hash) + NAMEONSHELF_FIELD_NUMBER;
        hash = (53 * hash) + getNameOnShelf().hashCode();
      }
      if (hasPatchedContentId()) {
        hash = (37 * hash) + PATCHEDCONTENTID_FIELD_NUMBER;
        hash = (53 * hash) + getPatchedContentId().hashCode();
      }
      if (hasDocumentId()) {
        hash = (37 * hash) + DOCUMENTID_FIELD_NUMBER;
        hash = (53 * hash) + getDocumentId().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Diadoc.Api.Proto.Content_v2Protos.Content_v2 parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Content_v2Protos.Content_v2 parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Content_v2Protos.Content_v2 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Content_v2Protos.Content_v2 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Content_v2Protos.Content_v2 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Content_v2Protos.Content_v2 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Content_v2Protos.Content_v2 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.Content_v2Protos.Content_v2 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Diadoc.Api.Proto.Content_v2Protos.Content_v2 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static Diadoc.Api.Proto.Content_v2Protos.Content_v2 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Content_v2Protos.Content_v2 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.Content_v2Protos.Content_v2 parseFrom(
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
    public static Builder newBuilder(Diadoc.Api.Proto.Content_v2Protos.Content_v2 prototype) {
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
     * Protobuf type {@code Diadoc.Api.Proto.Content_v2}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.Content_v2)
        Diadoc.Api.Proto.Content_v2Protos.Content_v2OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.Content_v2Protos.internal_static_Diadoc_Api_Proto_Content_v2_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.Content_v2Protos.internal_static_Diadoc_Api_Proto_Content_v2_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.Content_v2Protos.Content_v2.class, Diadoc.Api.Proto.Content_v2Protos.Content_v2.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.Content_v2Protos.Content_v2.newBuilder()
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
          getDocumentIdFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        content_ = com.google.protobuf.ByteString.EMPTY;
        nameOnShelf_ = "";
        patchedContentId_ = "";
        documentId_ = null;
        if (documentIdBuilder_ != null) {
          documentIdBuilder_.dispose();
          documentIdBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.Content_v2Protos.internal_static_Diadoc_Api_Proto_Content_v2_descriptor;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Content_v2Protos.Content_v2 getDefaultInstanceForType() {
        return Diadoc.Api.Proto.Content_v2Protos.Content_v2.getDefaultInstance();
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Content_v2Protos.Content_v2 build() {
        Diadoc.Api.Proto.Content_v2Protos.Content_v2 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Content_v2Protos.Content_v2 buildPartial() {
        Diadoc.Api.Proto.Content_v2Protos.Content_v2 result = new Diadoc.Api.Proto.Content_v2Protos.Content_v2(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(Diadoc.Api.Proto.Content_v2Protos.Content_v2 result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.content_ = content_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.nameOnShelf_ = nameOnShelf_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.patchedContentId_ = patchedContentId_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.documentId_ = documentIdBuilder_ == null
              ? documentId_
              : documentIdBuilder_.build();
          to_bitField0_ |= 0x00000008;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.Content_v2Protos.Content_v2) {
          return mergeFrom((Diadoc.Api.Proto.Content_v2Protos.Content_v2)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.Content_v2Protos.Content_v2 other) {
        if (other == Diadoc.Api.Proto.Content_v2Protos.Content_v2.getDefaultInstance()) return this;
        if (other.hasContent()) {
          setContent(other.getContent());
        }
        if (other.hasNameOnShelf()) {
          nameOnShelf_ = other.nameOnShelf_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.hasPatchedContentId()) {
          patchedContentId_ = other.patchedContentId_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (other.hasDocumentId()) {
          mergeDocumentId(other.getDocumentId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (hasDocumentId()) {
          if (!getDocumentId().isInitialized()) {
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
              case 10: {
                content_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                nameOnShelf_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                patchedContentId_ = input.readBytes();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 34: {
                input.readMessage(
                    getDocumentIdFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

      private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes Content = 1;</code>
       * @return Whether the content field is set.
       */
      @java.lang.Override
      public boolean hasContent() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional bytes Content = 1;</code>
       * @return The content.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getContent() {
        return content_;
      }
      /**
       * <code>optional bytes Content = 1;</code>
       * @param value The content to set.
       * @return This builder for chaining.
       */
      public Builder setContent(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        content_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes Content = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearContent() {
        bitField0_ = (bitField0_ & ~0x00000001);
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }

      private java.lang.Object nameOnShelf_ = "";
      /**
       * <code>optional string NameOnShelf = 2;</code>
       * @return Whether the nameOnShelf field is set.
       */
      public boolean hasNameOnShelf() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string NameOnShelf = 2;</code>
       * @return The nameOnShelf.
       */
      public java.lang.String getNameOnShelf() {
        java.lang.Object ref = nameOnShelf_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            nameOnShelf_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string NameOnShelf = 2;</code>
       * @return The bytes for nameOnShelf.
       */
      public com.google.protobuf.ByteString
          getNameOnShelfBytes() {
        java.lang.Object ref = nameOnShelf_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nameOnShelf_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string NameOnShelf = 2;</code>
       * @param value The nameOnShelf to set.
       * @return This builder for chaining.
       */
      public Builder setNameOnShelf(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        nameOnShelf_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>optional string NameOnShelf = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearNameOnShelf() {
        nameOnShelf_ = getDefaultInstance().getNameOnShelf();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>optional string NameOnShelf = 2;</code>
       * @param value The bytes for nameOnShelf to set.
       * @return This builder for chaining.
       */
      public Builder setNameOnShelfBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        nameOnShelf_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private java.lang.Object patchedContentId_ = "";
      /**
       * <code>optional string PatchedContentId = 3;</code>
       * @return Whether the patchedContentId field is set.
       */
      public boolean hasPatchedContentId() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional string PatchedContentId = 3;</code>
       * @return The patchedContentId.
       */
      public java.lang.String getPatchedContentId() {
        java.lang.Object ref = patchedContentId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            patchedContentId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string PatchedContentId = 3;</code>
       * @return The bytes for patchedContentId.
       */
      public com.google.protobuf.ByteString
          getPatchedContentIdBytes() {
        java.lang.Object ref = patchedContentId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          patchedContentId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string PatchedContentId = 3;</code>
       * @param value The patchedContentId to set.
       * @return This builder for chaining.
       */
      public Builder setPatchedContentId(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        patchedContentId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>optional string PatchedContentId = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPatchedContentId() {
        patchedContentId_ = getDefaultInstance().getPatchedContentId();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>optional string PatchedContentId = 3;</code>
       * @param value The bytes for patchedContentId to set.
       * @return This builder for chaining.
       */
      public Builder setPatchedContentIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        patchedContentId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private Diadoc.Api.Proto.DocumentIdProtos.DocumentIdEx documentId_;
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.DocumentIdProtos.DocumentIdEx, Diadoc.Api.Proto.DocumentIdProtos.DocumentIdEx.Builder, Diadoc.Api.Proto.DocumentIdProtos.DocumentIdExOrBuilder> documentIdBuilder_;
      /**
       * <code>optional .Diadoc.Api.Proto.DocumentIdEx DocumentId = 4;</code>
       * @return Whether the documentId field is set.
       */
      public boolean hasDocumentId() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional .Diadoc.Api.Proto.DocumentIdEx DocumentId = 4;</code>
       * @return The documentId.
       */
      public Diadoc.Api.Proto.DocumentIdProtos.DocumentIdEx getDocumentId() {
        if (documentIdBuilder_ == null) {
          return documentId_ == null ? Diadoc.Api.Proto.DocumentIdProtos.DocumentIdEx.getDefaultInstance() : documentId_;
        } else {
          return documentIdBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .Diadoc.Api.Proto.DocumentIdEx DocumentId = 4;</code>
       */
      public Builder setDocumentId(Diadoc.Api.Proto.DocumentIdProtos.DocumentIdEx value) {
        if (documentIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          documentId_ = value;
        } else {
          documentIdBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.DocumentIdEx DocumentId = 4;</code>
       */
      public Builder setDocumentId(
          Diadoc.Api.Proto.DocumentIdProtos.DocumentIdEx.Builder builderForValue) {
        if (documentIdBuilder_ == null) {
          documentId_ = builderForValue.build();
        } else {
          documentIdBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.DocumentIdEx DocumentId = 4;</code>
       */
      public Builder mergeDocumentId(Diadoc.Api.Proto.DocumentIdProtos.DocumentIdEx value) {
        if (documentIdBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0) &&
            documentId_ != null &&
            documentId_ != Diadoc.Api.Proto.DocumentIdProtos.DocumentIdEx.getDefaultInstance()) {
            getDocumentIdBuilder().mergeFrom(value);
          } else {
            documentId_ = value;
          }
        } else {
          documentIdBuilder_.mergeFrom(value);
        }
        if (documentId_ != null) {
          bitField0_ |= 0x00000008;
          onChanged();
        }
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.DocumentIdEx DocumentId = 4;</code>
       */
      public Builder clearDocumentId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        documentId_ = null;
        if (documentIdBuilder_ != null) {
          documentIdBuilder_.dispose();
          documentIdBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.DocumentIdEx DocumentId = 4;</code>
       */
      public Diadoc.Api.Proto.DocumentIdProtos.DocumentIdEx.Builder getDocumentIdBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getDocumentIdFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .Diadoc.Api.Proto.DocumentIdEx DocumentId = 4;</code>
       */
      public Diadoc.Api.Proto.DocumentIdProtos.DocumentIdExOrBuilder getDocumentIdOrBuilder() {
        if (documentIdBuilder_ != null) {
          return documentIdBuilder_.getMessageOrBuilder();
        } else {
          return documentId_ == null ?
              Diadoc.Api.Proto.DocumentIdProtos.DocumentIdEx.getDefaultInstance() : documentId_;
        }
      }
      /**
       * <code>optional .Diadoc.Api.Proto.DocumentIdEx DocumentId = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.DocumentIdProtos.DocumentIdEx, Diadoc.Api.Proto.DocumentIdProtos.DocumentIdEx.Builder, Diadoc.Api.Proto.DocumentIdProtos.DocumentIdExOrBuilder> 
          getDocumentIdFieldBuilder() {
        if (documentIdBuilder_ == null) {
          documentIdBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              Diadoc.Api.Proto.DocumentIdProtos.DocumentIdEx, Diadoc.Api.Proto.DocumentIdProtos.DocumentIdEx.Builder, Diadoc.Api.Proto.DocumentIdProtos.DocumentIdExOrBuilder>(
                  getDocumentId(),
                  getParentForChildren(),
                  isClean());
          documentId_ = null;
        }
        return documentIdBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.Content_v2)
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.Content_v2)
    private static final Diadoc.Api.Proto.Content_v2Protos.Content_v2 DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Diadoc.Api.Proto.Content_v2Protos.Content_v2();
    }

    public static Diadoc.Api.Proto.Content_v2Protos.Content_v2 getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Content_v2>
        PARSER = new com.google.protobuf.AbstractParser<Content_v2>() {
      @java.lang.Override
      public Content_v2 parsePartialFrom(
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

    public static com.google.protobuf.Parser<Content_v2> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Content_v2> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public Diadoc.Api.Proto.Content_v2Protos.Content_v2 getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_Content_v2_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_Content_v2_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020Content_v2.proto\022\020Diadoc.Api.Proto\032\020Do" +
      "cumentId.proto\"\200\001\n\nContent_v2\022\017\n\007Content" +
      "\030\001 \001(\014\022\023\n\013NameOnShelf\030\002 \001(\t\022\030\n\020PatchedCo" +
      "ntentId\030\003 \001(\t\0222\n\nDocumentId\030\004 \001(\0132\036.Diad" +
      "oc.Api.Proto.DocumentIdExB\022B\020Content_v2P" +
      "rotos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          Diadoc.Api.Proto.DocumentIdProtos.getDescriptor(),
        });
    internal_static_Diadoc_Api_Proto_Content_v2_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_Content_v2_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_Content_v2_descriptor,
        new java.lang.String[] { "Content", "NameOnShelf", "PatchedContentId", "DocumentId", });
    descriptor.resolveAllFeaturesImmutable();
    Diadoc.Api.Proto.DocumentIdProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
