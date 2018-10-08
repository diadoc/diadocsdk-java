// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Auth/AuthenticateByLoginInfo.proto

package Diadoc.Api.Proto.Auth;

public final class AuthenticateByLoginInfoProtos {
  private AuthenticateByLoginInfoProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AuthenticateByLoginInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.Auth.AuthenticateByLoginInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string Login = 1;</code>
     */
    boolean hasLogin();
    /**
     * <code>required string Login = 1;</code>
     */
    java.lang.String getLogin();
    /**
     * <code>required string Login = 1;</code>
     */
    com.google.protobuf.ByteString
        getLoginBytes();

    /**
     * <code>required string Password = 2;</code>
     */
    boolean hasPassword();
    /**
     * <code>required string Password = 2;</code>
     */
    java.lang.String getPassword();
    /**
     * <code>required string Password = 2;</code>
     */
    com.google.protobuf.ByteString
        getPasswordBytes();

    /**
     * <code>optional .Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfo TrustedServiceKeyInfo = 3;</code>
     */
    boolean hasTrustedServiceKeyInfo();
    /**
     * <code>optional .Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfo TrustedServiceKeyInfo = 3;</code>
     */
    Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo getTrustedServiceKeyInfo();
    /**
     * <code>optional .Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfo TrustedServiceKeyInfo = 3;</code>
     */
    Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfoOrBuilder getTrustedServiceKeyInfoOrBuilder();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.Auth.AuthenticateByLoginInfo}
   */
  public static final class AuthenticateByLoginInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.Auth.AuthenticateByLoginInfo)
      AuthenticateByLoginInfoOrBuilder {
    // Use AuthenticateByLoginInfo.newBuilder() to construct.
    private AuthenticateByLoginInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AuthenticateByLoginInfo(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AuthenticateByLoginInfo defaultInstance;
    public static AuthenticateByLoginInfo getDefaultInstance() {
      return defaultInstance;
    }

    public AuthenticateByLoginInfo getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private AuthenticateByLoginInfo(
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
              login_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              password_ = bs;
              break;
            }
            case 26: {
              Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = trustedServiceKeyInfo_.toBuilder();
              }
              trustedServiceKeyInfo_ = input.readMessage(Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(trustedServiceKeyInfo_);
                trustedServiceKeyInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
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
      return Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.internal_static_Diadoc_Api_Proto_Auth_AuthenticateByLoginInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.internal_static_Diadoc_Api_Proto_Auth_AuthenticateByLoginInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo.class, Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo.Builder.class);
    }

    public static com.google.protobuf.Parser<AuthenticateByLoginInfo> PARSER =
        new com.google.protobuf.AbstractParser<AuthenticateByLoginInfo>() {
      public AuthenticateByLoginInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AuthenticateByLoginInfo(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<AuthenticateByLoginInfo> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int LOGIN_FIELD_NUMBER = 1;
    private java.lang.Object login_;
    /**
     * <code>required string Login = 1;</code>
     */
    public boolean hasLogin() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string Login = 1;</code>
     */
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
     */
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
    private java.lang.Object password_;
    /**
     * <code>required string Password = 2;</code>
     */
    public boolean hasPassword() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string Password = 2;</code>
     */
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
     */
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

    public static final int TRUSTEDSERVICEKEYINFO_FIELD_NUMBER = 3;
    private Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo trustedServiceKeyInfo_;
    /**
     * <code>optional .Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfo TrustedServiceKeyInfo = 3;</code>
     */
    public boolean hasTrustedServiceKeyInfo() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfo TrustedServiceKeyInfo = 3;</code>
     */
    public Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo getTrustedServiceKeyInfo() {
      return trustedServiceKeyInfo_;
    }
    /**
     * <code>optional .Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfo TrustedServiceKeyInfo = 3;</code>
     */
    public Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfoOrBuilder getTrustedServiceKeyInfoOrBuilder() {
      return trustedServiceKeyInfo_;
    }

    private void initFields() {
      login_ = "";
      password_ = "";
      trustedServiceKeyInfo_ = Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
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
      if (hasTrustedServiceKeyInfo()) {
        if (!getTrustedServiceKeyInfo().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getLoginBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getPasswordBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, trustedServiceKeyInfo_);
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
          .computeBytesSize(1, getLoginBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getPasswordBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, trustedServiceKeyInfo_);
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

    public static Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo prototype) {
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
     * Protobuf type {@code Diadoc.Api.Proto.Auth.AuthenticateByLoginInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.Auth.AuthenticateByLoginInfo)
        Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.internal_static_Diadoc_Api_Proto_Auth_AuthenticateByLoginInfo_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.internal_static_Diadoc_Api_Proto_Auth_AuthenticateByLoginInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo.class, Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo.newBuilder()
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
          getTrustedServiceKeyInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        login_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        password_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (trustedServiceKeyInfoBuilder_ == null) {
          trustedServiceKeyInfo_ = Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo.getDefaultInstance();
        } else {
          trustedServiceKeyInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.internal_static_Diadoc_Api_Proto_Auth_AuthenticateByLoginInfo_descriptor;
      }

      public Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo getDefaultInstanceForType() {
        return Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo.getDefaultInstance();
      }

      public Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo build() {
        Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo buildPartial() {
        Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo result = new Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.login_ = login_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.password_ = password_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (trustedServiceKeyInfoBuilder_ == null) {
          result.trustedServiceKeyInfo_ = trustedServiceKeyInfo_;
        } else {
          result.trustedServiceKeyInfo_ = trustedServiceKeyInfoBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo) {
          return mergeFrom((Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo other) {
        if (other == Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo.getDefaultInstance()) return this;
        if (other.hasLogin()) {
          bitField0_ |= 0x00000001;
          login_ = other.login_;
          onChanged();
        }
        if (other.hasPassword()) {
          bitField0_ |= 0x00000002;
          password_ = other.password_;
          onChanged();
        }
        if (other.hasTrustedServiceKeyInfo()) {
          mergeTrustedServiceKeyInfo(other.getTrustedServiceKeyInfo());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasLogin()) {
          
          return false;
        }
        if (!hasPassword()) {
          
          return false;
        }
        if (hasTrustedServiceKeyInfo()) {
          if (!getTrustedServiceKeyInfo().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Diadoc.Api.Proto.Auth.AuthenticateByLoginInfoProtos.AuthenticateByLoginInfo) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object login_ = "";
      /**
       * <code>required string Login = 1;</code>
       */
      public boolean hasLogin() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string Login = 1;</code>
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
       */
      public Builder setLogin(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        login_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string Login = 1;</code>
       */
      public Builder clearLogin() {
        bitField0_ = (bitField0_ & ~0x00000001);
        login_ = getDefaultInstance().getLogin();
        onChanged();
        return this;
      }
      /**
       * <code>required string Login = 1;</code>
       */
      public Builder setLoginBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        login_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object password_ = "";
      /**
       * <code>required string Password = 2;</code>
       */
      public boolean hasPassword() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string Password = 2;</code>
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
       */
      public Builder setPassword(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        password_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string Password = 2;</code>
       */
      public Builder clearPassword() {
        bitField0_ = (bitField0_ & ~0x00000002);
        password_ = getDefaultInstance().getPassword();
        onChanged();
        return this;
      }
      /**
       * <code>required string Password = 2;</code>
       */
      public Builder setPasswordBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        password_ = value;
        onChanged();
        return this;
      }

      private Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo trustedServiceKeyInfo_ = Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo, Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo.Builder, Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfoOrBuilder> trustedServiceKeyInfoBuilder_;
      /**
       * <code>optional .Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfo TrustedServiceKeyInfo = 3;</code>
       */
      public boolean hasTrustedServiceKeyInfo() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfo TrustedServiceKeyInfo = 3;</code>
       */
      public Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo getTrustedServiceKeyInfo() {
        if (trustedServiceKeyInfoBuilder_ == null) {
          return trustedServiceKeyInfo_;
        } else {
          return trustedServiceKeyInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfo TrustedServiceKeyInfo = 3;</code>
       */
      public Builder setTrustedServiceKeyInfo(Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo value) {
        if (trustedServiceKeyInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          trustedServiceKeyInfo_ = value;
          onChanged();
        } else {
          trustedServiceKeyInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfo TrustedServiceKeyInfo = 3;</code>
       */
      public Builder setTrustedServiceKeyInfo(
          Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo.Builder builderForValue) {
        if (trustedServiceKeyInfoBuilder_ == null) {
          trustedServiceKeyInfo_ = builderForValue.build();
          onChanged();
        } else {
          trustedServiceKeyInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfo TrustedServiceKeyInfo = 3;</code>
       */
      public Builder mergeTrustedServiceKeyInfo(Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo value) {
        if (trustedServiceKeyInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              trustedServiceKeyInfo_ != Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo.getDefaultInstance()) {
            trustedServiceKeyInfo_ =
              Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo.newBuilder(trustedServiceKeyInfo_).mergeFrom(value).buildPartial();
          } else {
            trustedServiceKeyInfo_ = value;
          }
          onChanged();
        } else {
          trustedServiceKeyInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfo TrustedServiceKeyInfo = 3;</code>
       */
      public Builder clearTrustedServiceKeyInfo() {
        if (trustedServiceKeyInfoBuilder_ == null) {
          trustedServiceKeyInfo_ = Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo.getDefaultInstance();
          onChanged();
        } else {
          trustedServiceKeyInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfo TrustedServiceKeyInfo = 3;</code>
       */
      public Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo.Builder getTrustedServiceKeyInfoBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getTrustedServiceKeyInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfo TrustedServiceKeyInfo = 3;</code>
       */
      public Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfoOrBuilder getTrustedServiceKeyInfoOrBuilder() {
        if (trustedServiceKeyInfoBuilder_ != null) {
          return trustedServiceKeyInfoBuilder_.getMessageOrBuilder();
        } else {
          return trustedServiceKeyInfo_;
        }
      }
      /**
       * <code>optional .Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfo TrustedServiceKeyInfo = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo, Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo.Builder, Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfoOrBuilder> 
          getTrustedServiceKeyInfoFieldBuilder() {
        if (trustedServiceKeyInfoBuilder_ == null) {
          trustedServiceKeyInfoBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo, Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfo.Builder, Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.AuthenticateByTrustedServiceKeyInfoOrBuilder>(
                  getTrustedServiceKeyInfo(),
                  getParentForChildren(),
                  isClean());
          trustedServiceKeyInfo_ = null;
        }
        return trustedServiceKeyInfoBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.Auth.AuthenticateByLoginInfo)
    }

    static {
      defaultInstance = new AuthenticateByLoginInfo(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.Auth.AuthenticateByLoginInfo)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_Auth_AuthenticateByLoginInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_Auth_AuthenticateByLoginInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"Auth/AuthenticateByLoginInfo.proto\022\025Di" +
      "adoc.Api.Proto.Auth\032.Auth/AuthenticateBy" +
      "TrustedServiceKeyInfo.proto\"\225\001\n\027Authenti" +
      "cateByLoginInfo\022\r\n\005Login\030\001 \002(\t\022\020\n\010Passwo" +
      "rd\030\002 \002(\t\022Y\n\025TrustedServiceKeyInfo\030\003 \001(\0132" +
      ":.Diadoc.Api.Proto.Auth.AuthenticateByTr" +
      "ustedServiceKeyInfoB\037B\035AuthenticateByLog" +
      "inInfoProtos"
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
          Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.getDescriptor(),
        }, assigner);
    internal_static_Diadoc_Api_Proto_Auth_AuthenticateByLoginInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_Auth_AuthenticateByLoginInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_Auth_AuthenticateByLoginInfo_descriptor,
        new java.lang.String[] { "Login", "Password", "TrustedServiceKeyInfo", });
    Diadoc.Api.Proto.Auth.AuthenticateByTrustedServiceKeyInfoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
