// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: Documents/DocumentZip.proto
// Protobuf Java Version: 4.28.1

package Diadoc.Api.Proto.Documents;

public final class DocumentZipProtos {
  private DocumentZipProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      DocumentZipProtos.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DocumentZipGenerationResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.Documents.DocumentZipGenerationResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string ZipFileNameOnShelf = 1;</code>
     * @return Whether the zipFileNameOnShelf field is set.
     */
    boolean hasZipFileNameOnShelf();
    /**
     * <code>optional string ZipFileNameOnShelf = 1;</code>
     * @return The zipFileNameOnShelf.
     */
    java.lang.String getZipFileNameOnShelf();
    /**
     * <code>optional string ZipFileNameOnShelf = 1;</code>
     * @return The bytes for zipFileNameOnShelf.
     */
    com.google.protobuf.ByteString
        getZipFileNameOnShelfBytes();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.Documents.DocumentZipGenerationResult}
   */
  public static final class DocumentZipGenerationResult extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.Documents.DocumentZipGenerationResult)
      DocumentZipGenerationResultOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 1,
        /* suffix= */ "",
        DocumentZipGenerationResult.class.getName());
    }
    // Use DocumentZipGenerationResult.newBuilder() to construct.
    private DocumentZipGenerationResult(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private DocumentZipGenerationResult() {
      zipFileNameOnShelf_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.Documents.DocumentZipProtos.internal_static_Diadoc_Api_Proto_Documents_DocumentZipGenerationResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.Documents.DocumentZipProtos.internal_static_Diadoc_Api_Proto_Documents_DocumentZipGenerationResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult.class, Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult.Builder.class);
    }

    private int bitField0_;
    public static final int ZIPFILENAMEONSHELF_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object zipFileNameOnShelf_ = "";
    /**
     * <code>optional string ZipFileNameOnShelf = 1;</code>
     * @return Whether the zipFileNameOnShelf field is set.
     */
    @java.lang.Override
    public boolean hasZipFileNameOnShelf() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string ZipFileNameOnShelf = 1;</code>
     * @return The zipFileNameOnShelf.
     */
    @java.lang.Override
    public java.lang.String getZipFileNameOnShelf() {
      java.lang.Object ref = zipFileNameOnShelf_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          zipFileNameOnShelf_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string ZipFileNameOnShelf = 1;</code>
     * @return The bytes for zipFileNameOnShelf.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getZipFileNameOnShelfBytes() {
      java.lang.Object ref = zipFileNameOnShelf_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zipFileNameOnShelf_ = b;
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
        com.google.protobuf.GeneratedMessage.writeString(output, 1, zipFileNameOnShelf_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, zipFileNameOnShelf_);
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
      if (!(obj instanceof Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult)) {
        return super.equals(obj);
      }
      Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult other = (Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult) obj;

      if (hasZipFileNameOnShelf() != other.hasZipFileNameOnShelf()) return false;
      if (hasZipFileNameOnShelf()) {
        if (!getZipFileNameOnShelf()
            .equals(other.getZipFileNameOnShelf())) return false;
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
      if (hasZipFileNameOnShelf()) {
        hash = (37 * hash) + ZIPFILENAMEONSHELF_FIELD_NUMBER;
        hash = (53 * hash) + getZipFileNameOnShelf().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult parseFrom(
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
    public static Builder newBuilder(Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult prototype) {
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
     * Protobuf type {@code Diadoc.Api.Proto.Documents.DocumentZipGenerationResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.Documents.DocumentZipGenerationResult)
        Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.Documents.DocumentZipProtos.internal_static_Diadoc_Api_Proto_Documents_DocumentZipGenerationResult_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.Documents.DocumentZipProtos.internal_static_Diadoc_Api_Proto_Documents_DocumentZipGenerationResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult.class, Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult.newBuilder()
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
        zipFileNameOnShelf_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.Documents.DocumentZipProtos.internal_static_Diadoc_Api_Proto_Documents_DocumentZipGenerationResult_descriptor;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult getDefaultInstanceForType() {
        return Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult.getDefaultInstance();
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult build() {
        Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult buildPartial() {
        Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult result = new Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.zipFileNameOnShelf_ = zipFileNameOnShelf_;
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult) {
          return mergeFrom((Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult other) {
        if (other == Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult.getDefaultInstance()) return this;
        if (other.hasZipFileNameOnShelf()) {
          zipFileNameOnShelf_ = other.zipFileNameOnShelf_;
          bitField0_ |= 0x00000001;
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
                zipFileNameOnShelf_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

      private java.lang.Object zipFileNameOnShelf_ = "";
      /**
       * <code>optional string ZipFileNameOnShelf = 1;</code>
       * @return Whether the zipFileNameOnShelf field is set.
       */
      public boolean hasZipFileNameOnShelf() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string ZipFileNameOnShelf = 1;</code>
       * @return The zipFileNameOnShelf.
       */
      public java.lang.String getZipFileNameOnShelf() {
        java.lang.Object ref = zipFileNameOnShelf_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            zipFileNameOnShelf_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string ZipFileNameOnShelf = 1;</code>
       * @return The bytes for zipFileNameOnShelf.
       */
      public com.google.protobuf.ByteString
          getZipFileNameOnShelfBytes() {
        java.lang.Object ref = zipFileNameOnShelf_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          zipFileNameOnShelf_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string ZipFileNameOnShelf = 1;</code>
       * @param value The zipFileNameOnShelf to set.
       * @return This builder for chaining.
       */
      public Builder setZipFileNameOnShelf(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        zipFileNameOnShelf_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional string ZipFileNameOnShelf = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearZipFileNameOnShelf() {
        zipFileNameOnShelf_ = getDefaultInstance().getZipFileNameOnShelf();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>optional string ZipFileNameOnShelf = 1;</code>
       * @param value The bytes for zipFileNameOnShelf to set.
       * @return This builder for chaining.
       */
      public Builder setZipFileNameOnShelfBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        zipFileNameOnShelf_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.Documents.DocumentZipGenerationResult)
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.Documents.DocumentZipGenerationResult)
    private static final Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult();
    }

    public static Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DocumentZipGenerationResult>
        PARSER = new com.google.protobuf.AbstractParser<DocumentZipGenerationResult>() {
      @java.lang.Override
      public DocumentZipGenerationResult parsePartialFrom(
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

    public static com.google.protobuf.Parser<DocumentZipGenerationResult> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DocumentZipGenerationResult> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public Diadoc.Api.Proto.Documents.DocumentZipProtos.DocumentZipGenerationResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_Documents_DocumentZipGenerationResult_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_Documents_DocumentZipGenerationResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033Documents/DocumentZip.proto\022\032Diadoc.Ap" +
      "i.Proto.Documents\"9\n\033DocumentZipGenerati" +
      "onResult\022\032\n\022ZipFileNameOnShelf\030\001 \001(\tB\023B\021" +
      "DocumentZipProtos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Diadoc_Api_Proto_Documents_DocumentZipGenerationResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_Documents_DocumentZipGenerationResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_Documents_DocumentZipGenerationResult_descriptor,
        new java.lang.String[] { "ZipFileNameOnShelf", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
