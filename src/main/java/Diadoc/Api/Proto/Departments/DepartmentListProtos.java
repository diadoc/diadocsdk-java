// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: Departments/DepartmentList.proto
// Protobuf Java Version: 4.28.1

package Diadoc.Api.Proto.Departments;

public final class DepartmentListProtos {
  private DepartmentListProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      DepartmentListProtos.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DepartmentListOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.Departments.DepartmentList)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
     */
    java.util.List<Diadoc.Api.Proto.Departments.DepartmentProtos.Department> 
        getDepartmentsList();
    /**
     * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
     */
    Diadoc.Api.Proto.Departments.DepartmentProtos.Department getDepartments(int index);
    /**
     * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
     */
    int getDepartmentsCount();
    /**
     * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
     */
    java.util.List<? extends Diadoc.Api.Proto.Departments.DepartmentProtos.DepartmentOrBuilder> 
        getDepartmentsOrBuilderList();
    /**
     * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
     */
    Diadoc.Api.Proto.Departments.DepartmentProtos.DepartmentOrBuilder getDepartmentsOrBuilder(
        int index);

    /**
     * <code>required int32 TotalCount = 2;</code>
     * @return Whether the totalCount field is set.
     */
    boolean hasTotalCount();
    /**
     * <code>required int32 TotalCount = 2;</code>
     * @return The totalCount.
     */
    int getTotalCount();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.Departments.DepartmentList}
   */
  public static final class DepartmentList extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.Departments.DepartmentList)
      DepartmentListOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 1,
        /* suffix= */ "",
        DepartmentList.class.getName());
    }
    // Use DepartmentList.newBuilder() to construct.
    private DepartmentList(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private DepartmentList() {
      departments_ = java.util.Collections.emptyList();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.Departments.DepartmentListProtos.internal_static_Diadoc_Api_Proto_Departments_DepartmentList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.Departments.DepartmentListProtos.internal_static_Diadoc_Api_Proto_Departments_DepartmentList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList.class, Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList.Builder.class);
    }

    private int bitField0_;
    public static final int DEPARTMENTS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<Diadoc.Api.Proto.Departments.DepartmentProtos.Department> departments_;
    /**
     * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
     */
    @java.lang.Override
    public java.util.List<Diadoc.Api.Proto.Departments.DepartmentProtos.Department> getDepartmentsList() {
      return departments_;
    }
    /**
     * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends Diadoc.Api.Proto.Departments.DepartmentProtos.DepartmentOrBuilder> 
        getDepartmentsOrBuilderList() {
      return departments_;
    }
    /**
     * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
     */
    @java.lang.Override
    public int getDepartmentsCount() {
      return departments_.size();
    }
    /**
     * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
     */
    @java.lang.Override
    public Diadoc.Api.Proto.Departments.DepartmentProtos.Department getDepartments(int index) {
      return departments_.get(index);
    }
    /**
     * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
     */
    @java.lang.Override
    public Diadoc.Api.Proto.Departments.DepartmentProtos.DepartmentOrBuilder getDepartmentsOrBuilder(
        int index) {
      return departments_.get(index);
    }

    public static final int TOTALCOUNT_FIELD_NUMBER = 2;
    private int totalCount_ = 0;
    /**
     * <code>required int32 TotalCount = 2;</code>
     * @return Whether the totalCount field is set.
     */
    @java.lang.Override
    public boolean hasTotalCount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required int32 TotalCount = 2;</code>
     * @return The totalCount.
     */
    @java.lang.Override
    public int getTotalCount() {
      return totalCount_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTotalCount()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getDepartmentsCount(); i++) {
        if (!getDepartments(i).isInitialized()) {
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
      for (int i = 0; i < departments_.size(); i++) {
        output.writeMessage(1, departments_.get(i));
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeInt32(2, totalCount_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < departments_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, departments_.get(i));
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, totalCount_);
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
      if (!(obj instanceof Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList)) {
        return super.equals(obj);
      }
      Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList other = (Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList) obj;

      if (!getDepartmentsList()
          .equals(other.getDepartmentsList())) return false;
      if (hasTotalCount() != other.hasTotalCount()) return false;
      if (hasTotalCount()) {
        if (getTotalCount()
            != other.getTotalCount()) return false;
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
      if (getDepartmentsCount() > 0) {
        hash = (37 * hash) + DEPARTMENTS_FIELD_NUMBER;
        hash = (53 * hash) + getDepartmentsList().hashCode();
      }
      if (hasTotalCount()) {
        hash = (37 * hash) + TOTALCOUNT_FIELD_NUMBER;
        hash = (53 * hash) + getTotalCount();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList parseFrom(
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
    public static Builder newBuilder(Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList prototype) {
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
     * Protobuf type {@code Diadoc.Api.Proto.Departments.DepartmentList}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.Departments.DepartmentList)
        Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.Departments.DepartmentListProtos.internal_static_Diadoc_Api_Proto_Departments_DepartmentList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.Departments.DepartmentListProtos.internal_static_Diadoc_Api_Proto_Departments_DepartmentList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList.class, Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList.newBuilder()
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
        if (departmentsBuilder_ == null) {
          departments_ = java.util.Collections.emptyList();
        } else {
          departments_ = null;
          departmentsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        totalCount_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.Departments.DepartmentListProtos.internal_static_Diadoc_Api_Proto_Departments_DepartmentList_descriptor;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList getDefaultInstanceForType() {
        return Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList.getDefaultInstance();
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList build() {
        Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList buildPartial() {
        Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList result = new Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList result) {
        if (departmentsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            departments_ = java.util.Collections.unmodifiableList(departments_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.departments_ = departments_;
        } else {
          result.departments_ = departmentsBuilder_.build();
        }
      }

      private void buildPartial0(Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.totalCount_ = totalCount_;
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList) {
          return mergeFrom((Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList other) {
        if (other == Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList.getDefaultInstance()) return this;
        if (departmentsBuilder_ == null) {
          if (!other.departments_.isEmpty()) {
            if (departments_.isEmpty()) {
              departments_ = other.departments_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureDepartmentsIsMutable();
              departments_.addAll(other.departments_);
            }
            onChanged();
          }
        } else {
          if (!other.departments_.isEmpty()) {
            if (departmentsBuilder_.isEmpty()) {
              departmentsBuilder_.dispose();
              departmentsBuilder_ = null;
              departments_ = other.departments_;
              bitField0_ = (bitField0_ & ~0x00000001);
              departmentsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getDepartmentsFieldBuilder() : null;
            } else {
              departmentsBuilder_.addAllMessages(other.departments_);
            }
          }
        }
        if (other.hasTotalCount()) {
          setTotalCount(other.getTotalCount());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasTotalCount()) {
          return false;
        }
        for (int i = 0; i < getDepartmentsCount(); i++) {
          if (!getDepartments(i).isInitialized()) {
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
                Diadoc.Api.Proto.Departments.DepartmentProtos.Department m =
                    input.readMessage(
                        Diadoc.Api.Proto.Departments.DepartmentProtos.Department.parser(),
                        extensionRegistry);
                if (departmentsBuilder_ == null) {
                  ensureDepartmentsIsMutable();
                  departments_.add(m);
                } else {
                  departmentsBuilder_.addMessage(m);
                }
                break;
              } // case 10
              case 16: {
                totalCount_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

      private java.util.List<Diadoc.Api.Proto.Departments.DepartmentProtos.Department> departments_ =
        java.util.Collections.emptyList();
      private void ensureDepartmentsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          departments_ = new java.util.ArrayList<Diadoc.Api.Proto.Departments.DepartmentProtos.Department>(departments_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          Diadoc.Api.Proto.Departments.DepartmentProtos.Department, Diadoc.Api.Proto.Departments.DepartmentProtos.Department.Builder, Diadoc.Api.Proto.Departments.DepartmentProtos.DepartmentOrBuilder> departmentsBuilder_;

      /**
       * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
       */
      public java.util.List<Diadoc.Api.Proto.Departments.DepartmentProtos.Department> getDepartmentsList() {
        if (departmentsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(departments_);
        } else {
          return departmentsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
       */
      public int getDepartmentsCount() {
        if (departmentsBuilder_ == null) {
          return departments_.size();
        } else {
          return departmentsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
       */
      public Diadoc.Api.Proto.Departments.DepartmentProtos.Department getDepartments(int index) {
        if (departmentsBuilder_ == null) {
          return departments_.get(index);
        } else {
          return departmentsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
       */
      public Builder setDepartments(
          int index, Diadoc.Api.Proto.Departments.DepartmentProtos.Department value) {
        if (departmentsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDepartmentsIsMutable();
          departments_.set(index, value);
          onChanged();
        } else {
          departmentsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
       */
      public Builder setDepartments(
          int index, Diadoc.Api.Proto.Departments.DepartmentProtos.Department.Builder builderForValue) {
        if (departmentsBuilder_ == null) {
          ensureDepartmentsIsMutable();
          departments_.set(index, builderForValue.build());
          onChanged();
        } else {
          departmentsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
       */
      public Builder addDepartments(Diadoc.Api.Proto.Departments.DepartmentProtos.Department value) {
        if (departmentsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDepartmentsIsMutable();
          departments_.add(value);
          onChanged();
        } else {
          departmentsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
       */
      public Builder addDepartments(
          int index, Diadoc.Api.Proto.Departments.DepartmentProtos.Department value) {
        if (departmentsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDepartmentsIsMutable();
          departments_.add(index, value);
          onChanged();
        } else {
          departmentsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
       */
      public Builder addDepartments(
          Diadoc.Api.Proto.Departments.DepartmentProtos.Department.Builder builderForValue) {
        if (departmentsBuilder_ == null) {
          ensureDepartmentsIsMutable();
          departments_.add(builderForValue.build());
          onChanged();
        } else {
          departmentsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
       */
      public Builder addDepartments(
          int index, Diadoc.Api.Proto.Departments.DepartmentProtos.Department.Builder builderForValue) {
        if (departmentsBuilder_ == null) {
          ensureDepartmentsIsMutable();
          departments_.add(index, builderForValue.build());
          onChanged();
        } else {
          departmentsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
       */
      public Builder addAllDepartments(
          java.lang.Iterable<? extends Diadoc.Api.Proto.Departments.DepartmentProtos.Department> values) {
        if (departmentsBuilder_ == null) {
          ensureDepartmentsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, departments_);
          onChanged();
        } else {
          departmentsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
       */
      public Builder clearDepartments() {
        if (departmentsBuilder_ == null) {
          departments_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          departmentsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
       */
      public Builder removeDepartments(int index) {
        if (departmentsBuilder_ == null) {
          ensureDepartmentsIsMutable();
          departments_.remove(index);
          onChanged();
        } else {
          departmentsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
       */
      public Diadoc.Api.Proto.Departments.DepartmentProtos.Department.Builder getDepartmentsBuilder(
          int index) {
        return getDepartmentsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
       */
      public Diadoc.Api.Proto.Departments.DepartmentProtos.DepartmentOrBuilder getDepartmentsOrBuilder(
          int index) {
        if (departmentsBuilder_ == null) {
          return departments_.get(index);  } else {
          return departmentsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
       */
      public java.util.List<? extends Diadoc.Api.Proto.Departments.DepartmentProtos.DepartmentOrBuilder> 
           getDepartmentsOrBuilderList() {
        if (departmentsBuilder_ != null) {
          return departmentsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(departments_);
        }
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
       */
      public Diadoc.Api.Proto.Departments.DepartmentProtos.Department.Builder addDepartmentsBuilder() {
        return getDepartmentsFieldBuilder().addBuilder(
            Diadoc.Api.Proto.Departments.DepartmentProtos.Department.getDefaultInstance());
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
       */
      public Diadoc.Api.Proto.Departments.DepartmentProtos.Department.Builder addDepartmentsBuilder(
          int index) {
        return getDepartmentsFieldBuilder().addBuilder(
            index, Diadoc.Api.Proto.Departments.DepartmentProtos.Department.getDefaultInstance());
      }
      /**
       * <code>repeated .Diadoc.Api.Proto.Departments.Department Departments = 1;</code>
       */
      public java.util.List<Diadoc.Api.Proto.Departments.DepartmentProtos.Department.Builder> 
           getDepartmentsBuilderList() {
        return getDepartmentsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          Diadoc.Api.Proto.Departments.DepartmentProtos.Department, Diadoc.Api.Proto.Departments.DepartmentProtos.Department.Builder, Diadoc.Api.Proto.Departments.DepartmentProtos.DepartmentOrBuilder> 
          getDepartmentsFieldBuilder() {
        if (departmentsBuilder_ == null) {
          departmentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              Diadoc.Api.Proto.Departments.DepartmentProtos.Department, Diadoc.Api.Proto.Departments.DepartmentProtos.Department.Builder, Diadoc.Api.Proto.Departments.DepartmentProtos.DepartmentOrBuilder>(
                  departments_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          departments_ = null;
        }
        return departmentsBuilder_;
      }

      private int totalCount_ ;
      /**
       * <code>required int32 TotalCount = 2;</code>
       * @return Whether the totalCount field is set.
       */
      @java.lang.Override
      public boolean hasTotalCount() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required int32 TotalCount = 2;</code>
       * @return The totalCount.
       */
      @java.lang.Override
      public int getTotalCount() {
        return totalCount_;
      }
      /**
       * <code>required int32 TotalCount = 2;</code>
       * @param value The totalCount to set.
       * @return This builder for chaining.
       */
      public Builder setTotalCount(int value) {

        totalCount_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 TotalCount = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalCount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        totalCount_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.Departments.DepartmentList)
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.Departments.DepartmentList)
    private static final Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList();
    }

    public static Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DepartmentList>
        PARSER = new com.google.protobuf.AbstractParser<DepartmentList>() {
      @java.lang.Override
      public DepartmentList parsePartialFrom(
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

    public static com.google.protobuf.Parser<DepartmentList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DepartmentList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public Diadoc.Api.Proto.Departments.DepartmentListProtos.DepartmentList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_Departments_DepartmentList_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_Departments_DepartmentList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n Departments/DepartmentList.proto\022\034Diad" +
      "oc.Api.Proto.Departments\032\034Departments/De" +
      "partment.proto\"c\n\016DepartmentList\022=\n\013Depa" +
      "rtments\030\001 \003(\0132(.Diadoc.Api.Proto.Departm" +
      "ents.Department\022\022\n\nTotalCount\030\002 \002(\005B\026B\024D" +
      "epartmentListProtos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          Diadoc.Api.Proto.Departments.DepartmentProtos.getDescriptor(),
        });
    internal_static_Diadoc_Api_Proto_Departments_DepartmentList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_Departments_DepartmentList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_Departments_DepartmentList_descriptor,
        new java.lang.String[] { "Departments", "TotalCount", });
    descriptor.resolveAllFeaturesImmutable();
    Diadoc.Api.Proto.Departments.DepartmentProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
