// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: CounteragentGroups/CounteragentGroupToCreate.proto
// Protobuf Java Version: 4.28.3

package Diadoc.Api.Proto.CounteragentGroups;

public final class CounteragentGroupToCreateProtos {
  private CounteragentGroupToCreateProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      CounteragentGroupToCreateProtos.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CounteragentGroupToCreateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreate)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string Name = 1;</code>
     * @return Whether the name field is set.
     */
    boolean hasName();
    /**
     * <code>required string Name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>required string Name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
     * @return Whether the departments field is set.
     */
    boolean hasDepartments();
    /**
     * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
     * @return The departments.
     */
    Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup getDepartments();
    /**
     * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
     */
    Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroupOrBuilder getDepartmentsOrBuilder();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreate}
   */
  public static final class CounteragentGroupToCreate extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreate)
      CounteragentGroupToCreateOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 3,
        /* suffix= */ "",
        CounteragentGroupToCreate.class.getName());
    }
    // Use CounteragentGroupToCreate.newBuilder() to construct.
    private CounteragentGroupToCreate(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private CounteragentGroupToCreate() {
      name_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentGroupToCreate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentGroupToCreate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate.class, Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object name_ = "";
    /**
     * <code>required string Name = 1;</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string Name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string Name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DEPARTMENTS_FIELD_NUMBER = 2;
    private Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup departments_;
    /**
     * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
     * @return Whether the departments field is set.
     */
    @java.lang.Override
    public boolean hasDepartments() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
     * @return The departments.
     */
    @java.lang.Override
    public Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup getDepartments() {
      return departments_ == null ? Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup.getDefaultInstance() : departments_;
    }
    /**
     * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
     */
    @java.lang.Override
    public Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroupOrBuilder getDepartmentsOrBuilder() {
      return departments_ == null ? Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup.getDefaultInstance() : departments_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasName()) {
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
        com.google.protobuf.GeneratedMessage.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(2, getDepartments());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getDepartments());
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
      if (!(obj instanceof Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate)) {
        return super.equals(obj);
      }
      Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate other = (Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate) obj;

      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
      }
      if (hasDepartments() != other.hasDepartments()) return false;
      if (hasDepartments()) {
        if (!getDepartments()
            .equals(other.getDepartments())) return false;
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
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasDepartments()) {
        hash = (37 * hash) + DEPARTMENTS_FIELD_NUMBER;
        hash = (53 * hash) + getDepartments().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate parseFrom(
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
    public static Builder newBuilder(Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate prototype) {
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
     * Protobuf type {@code Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreate}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreate)
        Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentGroupToCreate_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentGroupToCreate_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate.class, Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate.newBuilder()
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
          getDepartmentsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        name_ = "";
        departments_ = null;
        if (departmentsBuilder_ != null) {
          departmentsBuilder_.dispose();
          departmentsBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentGroupToCreate_descriptor;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate getDefaultInstanceForType() {
        return Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate.getDefaultInstance();
      }

      @java.lang.Override
      public Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate build() {
        Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate buildPartial() {
        Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate result = new Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.name_ = name_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.departments_ = departmentsBuilder_ == null
              ? departments_
              : departmentsBuilder_.build();
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate) {
          return mergeFrom((Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate other) {
        if (other == Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate.getDefaultInstance()) return this;
        if (other.hasName()) {
          name_ = other.name_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasDepartments()) {
          mergeDepartments(other.getDepartments());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasName()) {
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
                name_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                input.readMessage(
                    getDepartmentsFieldBuilder().getBuilder(),
                    extensionRegistry);
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

      private java.lang.Object name_ = "";
      /**
       * <code>required string Name = 1;</code>
       * @return Whether the name field is set.
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string Name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string Name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string Name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>required string Name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        name_ = getDefaultInstance().getName();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>required string Name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup departments_;
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup, Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup.Builder, Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroupOrBuilder> departmentsBuilder_;
      /**
       * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
       * @return Whether the departments field is set.
       */
      public boolean hasDepartments() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
       * @return The departments.
       */
      public Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup getDepartments() {
        if (departmentsBuilder_ == null) {
          return departments_ == null ? Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup.getDefaultInstance() : departments_;
        } else {
          return departmentsBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
       */
      public Builder setDepartments(Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup value) {
        if (departmentsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          departments_ = value;
        } else {
          departmentsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
       */
      public Builder setDepartments(
          Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup.Builder builderForValue) {
        if (departmentsBuilder_ == null) {
          departments_ = builderForValue.build();
        } else {
          departmentsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
       */
      public Builder mergeDepartments(Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup value) {
        if (departmentsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            departments_ != null &&
            departments_ != Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup.getDefaultInstance()) {
            getDepartmentsBuilder().mergeFrom(value);
          } else {
            departments_ = value;
          }
        } else {
          departmentsBuilder_.mergeFrom(value);
        }
        if (departments_ != null) {
          bitField0_ |= 0x00000002;
          onChanged();
        }
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
       */
      public Builder clearDepartments() {
        bitField0_ = (bitField0_ & ~0x00000002);
        departments_ = null;
        if (departmentsBuilder_ != null) {
          departmentsBuilder_.dispose();
          departmentsBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
       */
      public Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup.Builder getDepartmentsBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getDepartmentsFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
       */
      public Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroupOrBuilder getDepartmentsOrBuilder() {
        if (departmentsBuilder_ != null) {
          return departmentsBuilder_.getMessageOrBuilder();
        } else {
          return departments_ == null ?
              Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup.getDefaultInstance() : departments_;
        }
      }
      /**
       * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup, Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup.Builder, Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroupOrBuilder> 
          getDepartmentsFieldBuilder() {
        if (departmentsBuilder_ == null) {
          departmentsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup, Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup.Builder, Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroupOrBuilder>(
                  getDepartments(),
                  getParentForChildren(),
                  isClean());
          departments_ = null;
        }
        return departmentsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreate)
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreate)
    private static final Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate();
    }

    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CounteragentGroupToCreate>
        PARSER = new com.google.protobuf.AbstractParser<CounteragentGroupToCreate>() {
      @java.lang.Override
      public CounteragentGroupToCreate parsePartialFrom(
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

    public static com.google.protobuf.Parser<CounteragentGroupToCreate> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CounteragentGroupToCreate> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentGroupToCreate_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentGroupToCreate_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2CounteragentGroups/CounteragentGroupTo" +
      "Create.proto\022#Diadoc.Api.Proto.Counterag" +
      "entGroups\032+CounteragentGroups/Department" +
      "sInGroup.proto\"w\n\031CounteragentGroupToCre" +
      "ate\022\014\n\004Name\030\001 \002(\t\022L\n\013Departments\030\002 \001(\01327" +
      ".Diadoc.Api.Proto.CounteragentGroups.Dep" +
      "artmentsInGroupB!B\037CounteragentGroupToCr" +
      "eateProtos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.getDescriptor(),
        });
    internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentGroupToCreate_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentGroupToCreate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentGroupToCreate_descriptor,
        new java.lang.String[] { "Name", "Departments", });
    descriptor.resolveAllFeaturesImmutable();
    Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
