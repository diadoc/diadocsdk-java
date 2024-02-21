// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CounteragentGroups/CounteragentGroupToCreate.proto

package Diadoc.Api.Proto.CounteragentGroups;

public final class CounteragentGroupToCreateProtos {
  private CounteragentGroupToCreateProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CounteragentGroupToCreateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreate)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string Name = 1;</code>
     */
    boolean hasName();
    /**
     * <code>required string Name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>required string Name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
     */
    boolean hasDepartments();
    /**
     * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
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
    // Use CounteragentGroupToCreate.newBuilder() to construct.
    private CounteragentGroupToCreate(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private CounteragentGroupToCreate(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final CounteragentGroupToCreate defaultInstance;
    public static CounteragentGroupToCreate getDefaultInstance() {
      return defaultInstance;
    }

    public CounteragentGroupToCreate getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private CounteragentGroupToCreate(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              name_ = bs;
              break;
            }
            case 18: {
              Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = departments_.toBuilder();
              }
              departments_ = input.readMessage(Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(departments_);
                departments_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentGroupToCreate_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentGroupToCreate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate.class, Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate.Builder.class);
    }

    public static com.google.protobuf.Parser<CounteragentGroupToCreate> PARSER =
        new com.google.protobuf.AbstractParser<CounteragentGroupToCreate>() {
      public CounteragentGroupToCreate parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CounteragentGroupToCreate(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<CounteragentGroupToCreate> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.Object name_;
    /**
     * <code>required string Name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string Name = 1;</code>
     */
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
     */
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
     */
    public boolean hasDepartments() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
     */
    public Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup getDepartments() {
      return departments_;
    }
    /**
     * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
     */
    public Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroupOrBuilder getDepartmentsOrBuilder() {
      return departments_;
    }

    private void initFields() {
      name_ = "";
      departments_ = Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
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

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, departments_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, departments_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
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
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

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
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getDepartmentsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (departmentsBuilder_ == null) {
          departments_ = Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup.getDefaultInstance();
        } else {
          departmentsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentGroupToCreate_descriptor;
      }

      public Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate getDefaultInstanceForType() {
        return Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate.getDefaultInstance();
      }

      public Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate build() {
        Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate buildPartial() {
        Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate result = new Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (departmentsBuilder_ == null) {
          result.departments_ = departments_;
        } else {
          result.departments_ = departmentsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

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
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasDepartments()) {
          mergeDepartments(other.getDepartments());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasName()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreateProtos.CounteragentGroupToCreate) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>required string Name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string Name = 1;</code>
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
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string Name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string Name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup departments_ = Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup, Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup.Builder, Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroupOrBuilder> departmentsBuilder_;
      /**
       * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
       */
      public boolean hasDepartments() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
       */
      public Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup getDepartments() {
        if (departmentsBuilder_ == null) {
          return departments_;
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
          onChanged();
        } else {
          departmentsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
       */
      public Builder setDepartments(
          Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup.Builder builderForValue) {
        if (departmentsBuilder_ == null) {
          departments_ = builderForValue.build();
          onChanged();
        } else {
          departmentsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
       */
      public Builder mergeDepartments(Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup value) {
        if (departmentsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              departments_ != Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup.getDefaultInstance()) {
            departments_ =
              Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup.newBuilder(departments_).mergeFrom(value).buildPartial();
          } else {
            departments_ = value;
          }
          onChanged();
        } else {
          departmentsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroup Departments = 2;</code>
       */
      public Builder clearDepartments() {
        if (departmentsBuilder_ == null) {
          departments_ = Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.DepartmentsInGroup.getDefaultInstance();
          onChanged();
        } else {
          departmentsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
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
          return departments_;
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

    static {
      defaultInstance = new CounteragentGroupToCreate(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.CounteragentGroups.CounteragentGroupToCreate)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentGroupToCreate_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentGroupToCreate_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
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
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.getDescriptor(),
        }, assigner);
    internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentGroupToCreate_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentGroupToCreate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_CounteragentGroups_CounteragentGroupToCreate_descriptor,
        new java.lang.String[] { "Name", "Departments", });
    Diadoc.Api.Proto.CounteragentGroups.DepartmentsInGroupProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
