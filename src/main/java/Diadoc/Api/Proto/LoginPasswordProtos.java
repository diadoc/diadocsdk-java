// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: LoginPassword.proto
// Protobuf Java Version: 4.28.3

package Diadoc.Api.Proto;

public final class LoginPasswordProtos {
  private LoginPasswordProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      LoginPasswordProtos.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LoginPasswordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.LoginPassword)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string Login = 1;</code>
     * @return Whether the login field is set.
     */
    boolean hasLogin();
    /**
     * <code>required string Login = 1;</code>
     * @return The login.
     */
    java.lang.String getLogin();
    /**
     * <code>required string Login = 1;</code>
     * @return The bytes for login.
     */
    com.google.protobuf.ByteString
        getLoginBytes();

    /**
     * <code>required string Password = 2;</code>
     * @return Whether the password field is set.
     */
    boolean hasPassword();
    /**
     * <code>required string Password = 2;</code>
     * @return The password.
     */
    java.lang.String getPassword();
    /**
     * <code>required string Password = 2;</code>
     * @return The bytes for password.
     */
    com.google.protobuf.ByteString
        getPasswordBytes();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.LoginPassword}
   */
  public static final class LoginPassword extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.LoginPassword)
      LoginPasswordOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 3,
        /* suffix= */ "",
        LoginPassword.class.getName());
    }
    // Use LoginPassword.newBuilder() to construct.
    private LoginPassword(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private LoginPassword() {
      login_ = "";
      password_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.LoginPasswordProtos.internal_static_Diadoc_Api_Proto_LoginPassword_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.LoginPasswordProtos.internal_static_Diadoc_Api_Proto_LoginPassword_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword.class, Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword.Builder.class);
    }

    private int bitField0_;
    public static final int LOGIN_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object login_ = "";
    /**
     * <code>required string Login = 1;</code>
     * @return Whether the login field is set.
     */
    @java.lang.Override
    public boolean hasLogin() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string Login = 1;</code>
     * @return The login.
     */
    @java.lang.Override
    public java.lang.String getLogin() {
      java.lang.Object ref = login_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          login_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string Login = 1;</code>
     * @return The bytes for login.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getLoginBytes() {
      java.lang.Object ref = login_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        login_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PASSWORD_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object password_ = "";
    /**
     * <code>required string Password = 2;</code>
     * @return Whether the password field is set.
     */
    @java.lang.Override
    public boolean hasPassword() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required string Password = 2;</code>
     * @return The password.
     */
    @java.lang.Override
    public java.lang.String getPassword() {
      java.lang.Object ref = password_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          password_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string Password = 2;</code>
     * @return The bytes for password.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      java.lang.Object ref = password_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        password_ = b;
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

      if (!hasLogin()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPassword()) {
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
        com.google.protobuf.GeneratedMessage.writeString(output, 1, login_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, password_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, login_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, password_);
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
      if (!(obj instanceof Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword)) {
        return super.equals(obj);
      }
      Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword other = (Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword) obj;

      if (hasLogin() != other.hasLogin()) return false;
      if (hasLogin()) {
        if (!getLogin()
            .equals(other.getLogin())) return false;
      }
      if (hasPassword() != other.hasPassword()) return false;
      if (hasPassword()) {
        if (!getPassword()
            .equals(other.getPassword())) return false;
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
      if (hasLogin()) {
        hash = (37 * hash) + LOGIN_FIELD_NUMBER;
        hash = (53 * hash) + getLogin().hashCode();
      }
      if (hasPassword()) {
        hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
        hash = (53 * hash) + getPassword().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword parseFrom(
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
    public static Builder newBuilder(Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword prototype) {
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
     * Protobuf type {@code Diadoc.Api.Proto.LoginPassword}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.LoginPassword)
        Diadoc.Api.Proto.LoginPasswordProtos.LoginPasswordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.LoginPasswordProtos.internal_static_Diadoc_Api_Proto_LoginPassword_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.LoginPasswordProtos.internal_static_Diadoc_Api_Proto_LoginPassword_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword.class, Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword.newBuilder()
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
        login_ = "";
        password_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.LoginPasswordProtos.internal_static_Diadoc_Api_Proto_LoginPassword_descriptor;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword getDefaultInstanceForType() {
        return Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword.getDefaultInstance();
      }

      @java.lang.Override
      public Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword build() {
        Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword buildPartial() {
        Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword result = new Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.login_ = login_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.password_ = password_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword) {
          return mergeFrom((Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword other) {
        if (other == Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword.getDefaultInstance()) return this;
        if (other.hasLogin()) {
          login_ = other.login_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasPassword()) {
          password_ = other.password_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasLogin()) {
          return false;
        }
        if (!hasPassword()) {
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
                login_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                password_ = input.readBytes();
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

      private java.lang.Object login_ = "";
      /**
       * <code>required string Login = 1;</code>
       * @return Whether the login field is set.
       */
      public boolean hasLogin() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string Login = 1;</code>
       * @return The login.
       */
      public java.lang.String getLogin() {
        java.lang.Object ref = login_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            login_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string Login = 1;</code>
       * @return The bytes for login.
       */
      public com.google.protobuf.ByteString
          getLoginBytes() {
        java.lang.Object ref = login_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          login_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string Login = 1;</code>
       * @param value The login to set.
       * @return This builder for chaining.
       */
      public Builder setLogin(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        login_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>required string Login = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLogin() {
        login_ = getDefaultInstance().getLogin();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>required string Login = 1;</code>
       * @param value The bytes for login to set.
       * @return This builder for chaining.
       */
      public Builder setLoginBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        login_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object password_ = "";
      /**
       * <code>required string Password = 2;</code>
       * @return Whether the password field is set.
       */
      public boolean hasPassword() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required string Password = 2;</code>
       * @return The password.
       */
      public java.lang.String getPassword() {
        java.lang.Object ref = password_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            password_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string Password = 2;</code>
       * @return The bytes for password.
       */
      public com.google.protobuf.ByteString
          getPasswordBytes() {
        java.lang.Object ref = password_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          password_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string Password = 2;</code>
       * @param value The password to set.
       * @return This builder for chaining.
       */
      public Builder setPassword(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        password_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>required string Password = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPassword() {
        password_ = getDefaultInstance().getPassword();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>required string Password = 2;</code>
       * @param value The bytes for password to set.
       * @return This builder for chaining.
       */
      public Builder setPasswordBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        password_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.LoginPassword)
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.LoginPassword)
    private static final Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword();
    }

    public static Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LoginPassword>
        PARSER = new com.google.protobuf.AbstractParser<LoginPassword>() {
      @java.lang.Override
      public LoginPassword parsePartialFrom(
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

    public static com.google.protobuf.Parser<LoginPassword> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LoginPassword> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public Diadoc.Api.Proto.LoginPasswordProtos.LoginPassword getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_LoginPassword_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_LoginPassword_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023LoginPassword.proto\022\020Diadoc.Api.Proto\"" +
      "0\n\rLoginPassword\022\r\n\005Login\030\001 \002(\t\022\020\n\010Passw" +
      "ord\030\002 \002(\tB\025B\023LoginPasswordProtos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Diadoc_Api_Proto_LoginPassword_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_LoginPassword_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_LoginPassword_descriptor,
        new java.lang.String[] { "Login", "Password", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
