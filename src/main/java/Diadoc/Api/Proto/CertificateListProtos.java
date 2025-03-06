// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: CertificateList.proto
// Protobuf Java Version: 4.28.1

package Diadoc.Api.Proto;

public final class CertificateListProtos {
  private CertificateListProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      CertificateListProtos.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CertificateListOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.CertificateList)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
     */
    java.util.List<Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2> 
        getCertificatesList();
    /**
     * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
     */
    Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2 getCertificates(int index);
    /**
     * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
     */
    int getCertificatesCount();
    /**
     * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
     */
    java.util.List<? extends Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2OrBuilder> 
        getCertificatesOrBuilderList();
    /**
     * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
     */
    Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2OrBuilder getCertificatesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.CertificateList}
   */
  public static final class CertificateList extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.CertificateList)
      CertificateListOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 1,
        /* suffix= */ "",
        CertificateList.class.getName());
    }
    // Use CertificateList.newBuilder() to construct.
    private CertificateList(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private CertificateList() {
      certificates_ = java.util.Collections.emptyList();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.CertificateListProtos.internal_static_Diadoc_Api_Proto_CertificateList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.CertificateListProtos.internal_static_Diadoc_Api_Proto_CertificateList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.CertificateListProtos.CertificateList.class, Diadoc.Api.Proto.CertificateListProtos.CertificateList.Builder.class);
    }

    public static final int CERTIFICATES_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2> certificates_;
    /**
     * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
     */
    @java.lang.Override
    public java.util.List<Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2> getCertificatesList() {
      return certificates_;
    }
    /**
     * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2OrBuilder> 
        getCertificatesOrBuilderList() {
      return certificates_;
    }
    /**
     * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
     */
    @java.lang.Override
    public int getCertificatesCount() {
      return certificates_.size();
    }
    /**
     * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
     */
    @java.lang.Override
    public Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2 getCertificates(int index) {
      return certificates_.get(index);
    }
    /**
     * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
     */
    @java.lang.Override
    public Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2OrBuilder getCertificatesOrBuilder(
        int index) {
      return certificates_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getCertificatesCount(); i++) {
        if (!getCertificates(i).isInitialized()) {
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
      for (int i = 0; i < certificates_.size(); i++) {
        output.writeMessage(1, certificates_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < certificates_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, certificates_.get(i));
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
      if (!(obj instanceof Diadoc.Api.Proto.CertificateListProtos.CertificateList)) {
        return super.equals(obj);
      }
      Diadoc.Api.Proto.CertificateListProtos.CertificateList other = (Diadoc.Api.Proto.CertificateListProtos.CertificateList) obj;

      if (!getCertificatesList()
          .equals(other.getCertificatesList())) return false;
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
      if (getCertificatesCount() > 0) {
        hash = (37 * hash) + CERTIFICATES_FIELD_NUMBER;
        hash = (53 * hash) + getCertificatesList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Diadoc.Api.Proto.CertificateListProtos.CertificateList parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.CertificateListProtos.CertificateList parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.CertificateListProtos.CertificateList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.CertificateListProtos.CertificateList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.CertificateListProtos.CertificateList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.CertificateListProtos.CertificateList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.CertificateListProtos.CertificateList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.CertificateListProtos.CertificateList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Diadoc.Api.Proto.CertificateListProtos.CertificateList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static Diadoc.Api.Proto.CertificateListProtos.CertificateList parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.CertificateListProtos.CertificateList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.CertificateListProtos.CertificateList parseFrom(
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
    public static Builder newBuilder(Diadoc.Api.Proto.CertificateListProtos.CertificateList prototype) {
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
     * Protobuf type {@code Diadoc.Api.Proto.CertificateList}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.CertificateList)
        Diadoc.Api.Proto.CertificateListProtos.CertificateListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.CertificateListProtos.internal_static_Diadoc_Api_Proto_CertificateList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.CertificateListProtos.internal_static_Diadoc_Api_Proto_CertificateList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.CertificateListProtos.CertificateList.class, Diadoc.Api.Proto.CertificateListProtos.CertificateList.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.CertificateListProtos.CertificateList.newBuilder()
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
        if (certificatesBuilder_ == null) {
          certificates_ = java.util.Collections.emptyList();
        } else {
          certificates_ = null;
          certificatesBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.CertificateListProtos.internal_static_Diadoc_Api_Proto_CertificateList_descriptor;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.CertificateListProtos.CertificateList getDefaultInstanceForType() {
        return Diadoc.Api.Proto.CertificateListProtos.CertificateList.getDefaultInstance();
      }

      @java.lang.Override
      public Diadoc.Api.Proto.CertificateListProtos.CertificateList build() {
        Diadoc.Api.Proto.CertificateListProtos.CertificateList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.CertificateListProtos.CertificateList buildPartial() {
        Diadoc.Api.Proto.CertificateListProtos.CertificateList result = new Diadoc.Api.Proto.CertificateListProtos.CertificateList(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(Diadoc.Api.Proto.CertificateListProtos.CertificateList result) {
        if (certificatesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            certificates_ = java.util.Collections.unmodifiableList(certificates_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.certificates_ = certificates_;
        } else {
          result.certificates_ = certificatesBuilder_.build();
        }
      }

      private void buildPartial0(Diadoc.Api.Proto.CertificateListProtos.CertificateList result) {
        int from_bitField0_ = bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.CertificateListProtos.CertificateList) {
          return mergeFrom((Diadoc.Api.Proto.CertificateListProtos.CertificateList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.CertificateListProtos.CertificateList other) {
        if (other == Diadoc.Api.Proto.CertificateListProtos.CertificateList.getDefaultInstance()) return this;
        if (certificatesBuilder_ == null) {
          if (!other.certificates_.isEmpty()) {
            if (certificates_.isEmpty()) {
              certificates_ = other.certificates_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureCertificatesIsMutable();
              certificates_.addAll(other.certificates_);
            }
            onChanged();
          }
        } else {
          if (!other.certificates_.isEmpty()) {
            if (certificatesBuilder_.isEmpty()) {
              certificatesBuilder_.dispose();
              certificatesBuilder_ = null;
              certificates_ = other.certificates_;
              bitField0_ = (bitField0_ & ~0x00000001);
              certificatesBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getCertificatesFieldBuilder() : null;
            } else {
              certificatesBuilder_.addAllMessages(other.certificates_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getCertificatesCount(); i++) {
          if (!getCertificates(i).isInitialized()) {
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
                Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2 m =
                    input.readMessage(
                        Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2.parser(),
                        extensionRegistry);
                if (certificatesBuilder_ == null) {
                  ensureCertificatesIsMutable();
                  certificates_.add(m);
                } else {
                  certificatesBuilder_.addMessage(m);
                }
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

      private java.util.List<Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2> certificates_ =
        java.util.Collections.emptyList();
      private void ensureCertificatesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          certificates_ = new java.util.ArrayList<Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2>(certificates_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2, Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2.Builder, Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2OrBuilder> certificatesBuilder_;

      /**
       * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
       */
      public java.util.List<Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2> getCertificatesList() {
        if (certificatesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(certificates_);
        } else {
          return certificatesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
       */
      public int getCertificatesCount() {
        if (certificatesBuilder_ == null) {
          return certificates_.size();
        } else {
          return certificatesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
       */
      public Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2 getCertificates(int index) {
        if (certificatesBuilder_ == null) {
          return certificates_.get(index);
        } else {
          return certificatesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
       */
      public Builder setCertificates(
          int index, Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2 value) {
        if (certificatesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCertificatesIsMutable();
          certificates_.set(index, value);
          onChanged();
        } else {
          certificatesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
       */
      public Builder setCertificates(
          int index, Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2.Builder builderForValue) {
        if (certificatesBuilder_ == null) {
          ensureCertificatesIsMutable();
          certificates_.set(index, builderForValue.build());
          onChanged();
        } else {
          certificatesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
       */
      public Builder addCertificates(Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2 value) {
        if (certificatesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCertificatesIsMutable();
          certificates_.add(value);
          onChanged();
        } else {
          certificatesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
       */
      public Builder addCertificates(
          int index, Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2 value) {
        if (certificatesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCertificatesIsMutable();
          certificates_.add(index, value);
          onChanged();
        } else {
          certificatesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
       */
      public Builder addCertificates(
          Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2.Builder builderForValue) {
        if (certificatesBuilder_ == null) {
          ensureCertificatesIsMutable();
          certificates_.add(builderForValue.build());
          onChanged();
        } else {
          certificatesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
       */
      public Builder addCertificates(
          int index, Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2.Builder builderForValue) {
        if (certificatesBuilder_ == null) {
          ensureCertificatesIsMutable();
          certificates_.add(index, builderForValue.build());
          onChanged();
        } else {
          certificatesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
       */
      public Builder addAllCertificates(
          java.lang.Iterable<? extends Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2> values) {
        if (certificatesBuilder_ == null) {
          ensureCertificatesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, certificates_);
          onChanged();
        } else {
          certificatesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
       */
      public Builder clearCertificates() {
        if (certificatesBuilder_ == null) {
          certificates_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          certificatesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
       */
      public Builder removeCertificates(int index) {
        if (certificatesBuilder_ == null) {
          ensureCertificatesIsMutable();
          certificates_.remove(index);
          onChanged();
        } else {
          certificatesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
       */
      public Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2.Builder getCertificatesBuilder(
          int index) {
        return getCertificatesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
       */
      public Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2OrBuilder getCertificatesOrBuilder(
          int index) {
        if (certificatesBuilder_ == null) {
          return certificates_.get(index);  } else {
          return certificatesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
       */
      public java.util.List<? extends Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2OrBuilder> 
           getCertificatesOrBuilderList() {
        if (certificatesBuilder_ != null) {
          return certificatesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(certificates_);
        }
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
       */
      public Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2.Builder addCertificatesBuilder() {
        return getCertificatesFieldBuilder().addBuilder(
            Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2.getDefaultInstance());
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
       */
      public Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2.Builder addCertificatesBuilder(
          int index) {
        return getCertificatesFieldBuilder().addBuilder(
            index, Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2.getDefaultInstance());
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.CertificateInfoV2 Certificates = 1;</code>
       */
      public java.util.List<Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2.Builder> 
           getCertificatesBuilderList() {
        return getCertificatesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2, Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2.Builder, Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2OrBuilder> 
          getCertificatesFieldBuilder() {
        if (certificatesBuilder_ == null) {
          certificatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2, Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2.Builder, Diadoc.Api.Proto.CertificateInfoV2Protos.CertificateInfoV2OrBuilder>(
                  certificates_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          certificates_ = null;
        }
        return certificatesBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.CertificateList)
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.CertificateList)
    private static final Diadoc.Api.Proto.CertificateListProtos.CertificateList DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Diadoc.Api.Proto.CertificateListProtos.CertificateList();
    }

    public static Diadoc.Api.Proto.CertificateListProtos.CertificateList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CertificateList>
        PARSER = new com.google.protobuf.AbstractParser<CertificateList>() {
      @java.lang.Override
      public CertificateList parsePartialFrom(
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

    public static com.google.protobuf.Parser<CertificateList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CertificateList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public Diadoc.Api.Proto.CertificateListProtos.CertificateList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_CertificateList_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_CertificateList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025CertificateList.proto\022\020Diadoc.Api.Prot" +
      "o\032\027CertificateInfoV2.proto\"L\n\017Certificat" +
      "eList\0229\n\014Certificates\030\001 \003(\0132#.Diadoc.Api" +
      ".Proto.CertificateInfoV2B\027B\025CertificateL" +
      "istProtos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          Diadoc.Api.Proto.CertificateInfoV2Protos.getDescriptor(),
        });
    internal_static_Diadoc_Api_Proto_CertificateList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_CertificateList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_CertificateList_descriptor,
        new java.lang.String[] { "Certificates", });
    descriptor.resolveAllFeaturesImmutable();
    Diadoc.Api.Proto.CertificateInfoV2Protos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
