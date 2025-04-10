// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: AsyncMethodResult.proto
// Protobuf Java Version: 4.28.3

package Diadoc.Api.Proto;

public final class AsyncMethodResultProtos {
  private AsyncMethodResultProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      AsyncMethodResultProtos.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AsyncMethodResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.AsyncMethodResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string TaskId = 1;</code>
     * @return Whether the taskId field is set.
     */
    boolean hasTaskId();
    /**
     * <code>optional string TaskId = 1;</code>
     * @return The taskId.
     */
    java.lang.String getTaskId();
    /**
     * <code>optional string TaskId = 1;</code>
     * @return The bytes for taskId.
     */
    com.google.protobuf.ByteString
        getTaskIdBytes();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.AsyncMethodResult}
   */
  public static final class AsyncMethodResult extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.AsyncMethodResult)
      AsyncMethodResultOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 3,
        /* suffix= */ "",
        AsyncMethodResult.class.getName());
    }
    // Use AsyncMethodResult.newBuilder() to construct.
    private AsyncMethodResult(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private AsyncMethodResult() {
      taskId_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.AsyncMethodResultProtos.internal_static_Diadoc_Api_Proto_AsyncMethodResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.AsyncMethodResultProtos.internal_static_Diadoc_Api_Proto_AsyncMethodResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult.class, Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult.Builder.class);
    }

    private int bitField0_;
    public static final int TASKID_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object taskId_ = "";
    /**
     * <code>optional string TaskId = 1;</code>
     * @return Whether the taskId field is set.
     */
    @java.lang.Override
    public boolean hasTaskId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string TaskId = 1;</code>
     * @return The taskId.
     */
    @java.lang.Override
    public java.lang.String getTaskId() {
      java.lang.Object ref = taskId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          taskId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string TaskId = 1;</code>
     * @return The bytes for taskId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTaskIdBytes() {
      java.lang.Object ref = taskId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        taskId_ = b;
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
        com.google.protobuf.GeneratedMessage.writeString(output, 1, taskId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, taskId_);
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
      if (!(obj instanceof Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult)) {
        return super.equals(obj);
      }
      Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult other = (Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult) obj;

      if (hasTaskId() != other.hasTaskId()) return false;
      if (hasTaskId()) {
        if (!getTaskId()
            .equals(other.getTaskId())) return false;
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
      if (hasTaskId()) {
        hash = (37 * hash) + TASKID_FIELD_NUMBER;
        hash = (53 * hash) + getTaskId().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult parseFrom(
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
    public static Builder newBuilder(Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult prototype) {
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
     * Protobuf type {@code Diadoc.Api.Proto.AsyncMethodResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.AsyncMethodResult)
        Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.AsyncMethodResultProtos.internal_static_Diadoc_Api_Proto_AsyncMethodResult_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.AsyncMethodResultProtos.internal_static_Diadoc_Api_Proto_AsyncMethodResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult.class, Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult.newBuilder()
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
        taskId_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.AsyncMethodResultProtos.internal_static_Diadoc_Api_Proto_AsyncMethodResult_descriptor;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult getDefaultInstanceForType() {
        return Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult.getDefaultInstance();
      }

      @java.lang.Override
      public Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult build() {
        Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult buildPartial() {
        Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult result = new Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.taskId_ = taskId_;
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult) {
          return mergeFrom((Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult other) {
        if (other == Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult.getDefaultInstance()) return this;
        if (other.hasTaskId()) {
          taskId_ = other.taskId_;
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
                taskId_ = input.readBytes();
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

      private java.lang.Object taskId_ = "";
      /**
       * <code>optional string TaskId = 1;</code>
       * @return Whether the taskId field is set.
       */
      public boolean hasTaskId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional string TaskId = 1;</code>
       * @return The taskId.
       */
      public java.lang.String getTaskId() {
        java.lang.Object ref = taskId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            taskId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string TaskId = 1;</code>
       * @return The bytes for taskId.
       */
      public com.google.protobuf.ByteString
          getTaskIdBytes() {
        java.lang.Object ref = taskId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          taskId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string TaskId = 1;</code>
       * @param value The taskId to set.
       * @return This builder for chaining.
       */
      public Builder setTaskId(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        taskId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>optional string TaskId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTaskId() {
        taskId_ = getDefaultInstance().getTaskId();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>optional string TaskId = 1;</code>
       * @param value The bytes for taskId to set.
       * @return This builder for chaining.
       */
      public Builder setTaskIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        taskId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.AsyncMethodResult)
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.AsyncMethodResult)
    private static final Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult();
    }

    public static Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AsyncMethodResult>
        PARSER = new com.google.protobuf.AbstractParser<AsyncMethodResult>() {
      @java.lang.Override
      public AsyncMethodResult parsePartialFrom(
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

    public static com.google.protobuf.Parser<AsyncMethodResult> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AsyncMethodResult> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public Diadoc.Api.Proto.AsyncMethodResultProtos.AsyncMethodResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_AsyncMethodResult_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_AsyncMethodResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027AsyncMethodResult.proto\022\020Diadoc.Api.Pr" +
      "oto\"#\n\021AsyncMethodResult\022\016\n\006TaskId\030\001 \001(\t" +
      "B\031B\027AsyncMethodResultProtos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Diadoc_Api_Proto_AsyncMethodResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_AsyncMethodResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_AsyncMethodResult_descriptor,
        new java.lang.String[] { "TaskId", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
