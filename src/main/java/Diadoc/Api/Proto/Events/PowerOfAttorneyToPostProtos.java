// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Events/PowerOfAttorneyToPost.proto

package Diadoc.Api.Proto.Events;

public final class PowerOfAttorneyToPostProtos {
  private PowerOfAttorneyToPostProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PowerOfAttorneyToPostOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.Events.PowerOfAttorneyToPost)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
     */
    boolean hasFullId();
    /**
     * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
     */
    Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId getFullId();
    /**
     * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
     */
    Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullIdOrBuilder getFullIdOrBuilder();

    /**
     * <code>required bool UseDefault = 2;</code>
     */
    boolean hasUseDefault();
    /**
     * <code>required bool UseDefault = 2;</code>
     */
    boolean getUseDefault();

    /**
     * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneySignedContent Content = 3;</code>
     */
    boolean hasContent();
    /**
     * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneySignedContent Content = 3;</code>
     */
    Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent getContent();
    /**
     * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneySignedContent Content = 3;</code>
     */
    Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContentOrBuilder getContentOrBuilder();

    /**
     * <code>optional bool SendAsFile = 4;</code>
     */
    boolean hasSendAsFile();
    /**
     * <code>optional bool SendAsFile = 4;</code>
     */
    boolean getSendAsFile();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.Events.PowerOfAttorneyToPost}
   */
  public static final class PowerOfAttorneyToPost extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.Events.PowerOfAttorneyToPost)
      PowerOfAttorneyToPostOrBuilder {
    // Use PowerOfAttorneyToPost.newBuilder() to construct.
    private PowerOfAttorneyToPost(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PowerOfAttorneyToPost(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PowerOfAttorneyToPost defaultInstance;
    public static PowerOfAttorneyToPost getDefaultInstance() {
      return defaultInstance;
    }

    public PowerOfAttorneyToPost getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PowerOfAttorneyToPost(
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
              Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = fullId_.toBuilder();
              }
              fullId_ = input.readMessage(Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(fullId_);
                fullId_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              useDefault_ = input.readBool();
              break;
            }
            case 26: {
              Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = content_.toBuilder();
              }
              content_ = input.readMessage(Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(content_);
                content_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              sendAsFile_ = input.readBool();
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
      return Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.internal_static_Diadoc_Api_Proto_Events_PowerOfAttorneyToPost_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.internal_static_Diadoc_Api_Proto_Events_PowerOfAttorneyToPost_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost.class, Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost.Builder.class);
    }

    public static com.google.protobuf.Parser<PowerOfAttorneyToPost> PARSER =
        new com.google.protobuf.AbstractParser<PowerOfAttorneyToPost>() {
      public PowerOfAttorneyToPost parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PowerOfAttorneyToPost(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PowerOfAttorneyToPost> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int FULLID_FIELD_NUMBER = 1;
    private Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId fullId_;
    /**
     * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
     */
    public boolean hasFullId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
     */
    public Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId getFullId() {
      return fullId_;
    }
    /**
     * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
     */
    public Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullIdOrBuilder getFullIdOrBuilder() {
      return fullId_;
    }

    public static final int USEDEFAULT_FIELD_NUMBER = 2;
    private boolean useDefault_;
    /**
     * <code>required bool UseDefault = 2;</code>
     */
    public boolean hasUseDefault() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required bool UseDefault = 2;</code>
     */
    public boolean getUseDefault() {
      return useDefault_;
    }

    public static final int CONTENT_FIELD_NUMBER = 3;
    private Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent content_;
    /**
     * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneySignedContent Content = 3;</code>
     */
    public boolean hasContent() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneySignedContent Content = 3;</code>
     */
    public Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent getContent() {
      return content_;
    }
    /**
     * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneySignedContent Content = 3;</code>
     */
    public Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContentOrBuilder getContentOrBuilder() {
      return content_;
    }

    public static final int SENDASFILE_FIELD_NUMBER = 4;
    private boolean sendAsFile_;
    /**
     * <code>optional bool SendAsFile = 4;</code>
     */
    public boolean hasSendAsFile() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bool SendAsFile = 4;</code>
     */
    public boolean getSendAsFile() {
      return sendAsFile_;
    }

    private void initFields() {
      fullId_ = Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.getDefaultInstance();
      useDefault_ = false;
      content_ = Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent.getDefaultInstance();
      sendAsFile_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasUseDefault()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasFullId()) {
        if (!getFullId().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasContent()) {
        if (!getContent().isInitialized()) {
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
        output.writeMessage(1, fullId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, useDefault_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, content_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBool(4, sendAsFile_);
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
          .computeMessageSize(1, fullId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, useDefault_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, content_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, sendAsFile_);
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

    public static Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost prototype) {
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
     * Protobuf type {@code Diadoc.Api.Proto.Events.PowerOfAttorneyToPost}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.Events.PowerOfAttorneyToPost)
        Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPostOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.internal_static_Diadoc_Api_Proto_Events_PowerOfAttorneyToPost_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.internal_static_Diadoc_Api_Proto_Events_PowerOfAttorneyToPost_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost.class, Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost.newBuilder()
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
          getFullIdFieldBuilder();
          getContentFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (fullIdBuilder_ == null) {
          fullId_ = Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.getDefaultInstance();
        } else {
          fullIdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        useDefault_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (contentBuilder_ == null) {
          content_ = Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent.getDefaultInstance();
        } else {
          contentBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        sendAsFile_ = false;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.internal_static_Diadoc_Api_Proto_Events_PowerOfAttorneyToPost_descriptor;
      }

      public Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost getDefaultInstanceForType() {
        return Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost.getDefaultInstance();
      }

      public Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost build() {
        Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost buildPartial() {
        Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost result = new Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (fullIdBuilder_ == null) {
          result.fullId_ = fullId_;
        } else {
          result.fullId_ = fullIdBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.useDefault_ = useDefault_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (contentBuilder_ == null) {
          result.content_ = content_;
        } else {
          result.content_ = contentBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.sendAsFile_ = sendAsFile_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost) {
          return mergeFrom((Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost other) {
        if (other == Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost.getDefaultInstance()) return this;
        if (other.hasFullId()) {
          mergeFullId(other.getFullId());
        }
        if (other.hasUseDefault()) {
          setUseDefault(other.getUseDefault());
        }
        if (other.hasContent()) {
          mergeContent(other.getContent());
        }
        if (other.hasSendAsFile()) {
          setSendAsFile(other.getSendAsFile());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasUseDefault()) {
          
          return false;
        }
        if (hasFullId()) {
          if (!getFullId().isInitialized()) {
            
            return false;
          }
        }
        if (hasContent()) {
          if (!getContent().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Diadoc.Api.Proto.Events.PowerOfAttorneyToPostProtos.PowerOfAttorneyToPost) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId fullId_ = Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId, Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.Builder, Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullIdOrBuilder> fullIdBuilder_;
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
       */
      public boolean hasFullId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
       */
      public Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId getFullId() {
        if (fullIdBuilder_ == null) {
          return fullId_;
        } else {
          return fullIdBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
       */
      public Builder setFullId(Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId value) {
        if (fullIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          fullId_ = value;
          onChanged();
        } else {
          fullIdBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
       */
      public Builder setFullId(
          Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.Builder builderForValue) {
        if (fullIdBuilder_ == null) {
          fullId_ = builderForValue.build();
          onChanged();
        } else {
          fullIdBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
       */
      public Builder mergeFullId(Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId value) {
        if (fullIdBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              fullId_ != Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.getDefaultInstance()) {
            fullId_ =
              Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.newBuilder(fullId_).mergeFrom(value).buildPartial();
          } else {
            fullId_ = value;
          }
          onChanged();
        } else {
          fullIdBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
       */
      public Builder clearFullId() {
        if (fullIdBuilder_ == null) {
          fullId_ = Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.getDefaultInstance();
          onChanged();
        } else {
          fullIdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
       */
      public Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.Builder getFullIdBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getFullIdFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
       */
      public Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullIdOrBuilder getFullIdOrBuilder() {
        if (fullIdBuilder_ != null) {
          return fullIdBuilder_.getMessageOrBuilder();
        } else {
          return fullId_;
        }
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyFullId FullId = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId, Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.Builder, Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullIdOrBuilder> 
          getFullIdFieldBuilder() {
        if (fullIdBuilder_ == null) {
          fullIdBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId, Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullId.Builder, Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneyFullIdOrBuilder>(
                  getFullId(),
                  getParentForChildren(),
                  isClean());
          fullId_ = null;
        }
        return fullIdBuilder_;
      }

      private boolean useDefault_ ;
      /**
       * <code>required bool UseDefault = 2;</code>
       */
      public boolean hasUseDefault() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required bool UseDefault = 2;</code>
       */
      public boolean getUseDefault() {
        return useDefault_;
      }
      /**
       * <code>required bool UseDefault = 2;</code>
       */
      public Builder setUseDefault(boolean value) {
        bitField0_ |= 0x00000002;
        useDefault_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool UseDefault = 2;</code>
       */
      public Builder clearUseDefault() {
        bitField0_ = (bitField0_ & ~0x00000002);
        useDefault_ = false;
        onChanged();
        return this;
      }

      private Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent content_ = Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent, Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent.Builder, Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContentOrBuilder> contentBuilder_;
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneySignedContent Content = 3;</code>
       */
      public boolean hasContent() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneySignedContent Content = 3;</code>
       */
      public Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent getContent() {
        if (contentBuilder_ == null) {
          return content_;
        } else {
          return contentBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneySignedContent Content = 3;</code>
       */
      public Builder setContent(Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent value) {
        if (contentBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          content_ = value;
          onChanged();
        } else {
          contentBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneySignedContent Content = 3;</code>
       */
      public Builder setContent(
          Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent.Builder builderForValue) {
        if (contentBuilder_ == null) {
          content_ = builderForValue.build();
          onChanged();
        } else {
          contentBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneySignedContent Content = 3;</code>
       */
      public Builder mergeContent(Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent value) {
        if (contentBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              content_ != Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent.getDefaultInstance()) {
            content_ =
              Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent.newBuilder(content_).mergeFrom(value).buildPartial();
          } else {
            content_ = value;
          }
          onChanged();
        } else {
          contentBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneySignedContent Content = 3;</code>
       */
      public Builder clearContent() {
        if (contentBuilder_ == null) {
          content_ = Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent.getDefaultInstance();
          onChanged();
        } else {
          contentBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneySignedContent Content = 3;</code>
       */
      public Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent.Builder getContentBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getContentFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneySignedContent Content = 3;</code>
       */
      public Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContentOrBuilder getContentOrBuilder() {
        if (contentBuilder_ != null) {
          return contentBuilder_.getMessageOrBuilder();
        } else {
          return content_;
        }
      }
      /**
       * <code>optional .Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneySignedContent Content = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent, Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent.Builder, Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContentOrBuilder> 
          getContentFieldBuilder() {
        if (contentBuilder_ == null) {
          contentBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent, Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContent.Builder, Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.PowerOfAttorneySignedContentOrBuilder>(
                  getContent(),
                  getParentForChildren(),
                  isClean());
          content_ = null;
        }
        return contentBuilder_;
      }

      private boolean sendAsFile_ ;
      /**
       * <code>optional bool SendAsFile = 4;</code>
       */
      public boolean hasSendAsFile() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional bool SendAsFile = 4;</code>
       */
      public boolean getSendAsFile() {
        return sendAsFile_;
      }
      /**
       * <code>optional bool SendAsFile = 4;</code>
       */
      public Builder setSendAsFile(boolean value) {
        bitField0_ |= 0x00000008;
        sendAsFile_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool SendAsFile = 4;</code>
       */
      public Builder clearSendAsFile() {
        bitField0_ = (bitField0_ & ~0x00000008);
        sendAsFile_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.Events.PowerOfAttorneyToPost)
    }

    static {
      defaultInstance = new PowerOfAttorneyToPost(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.Events.PowerOfAttorneyToPost)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_Events_PowerOfAttorneyToPost_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_Events_PowerOfAttorneyToPost_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"Events/PowerOfAttorneyToPost.proto\022\027Di" +
      "adoc.Api.Proto.Events\032&PowersOfAttorney/" +
      "PowerOfAttorney.proto\"\333\001\n\025PowerOfAttorne" +
      "yToPost\022H\n\006FullId\030\001 \001(\01328.Diadoc.Api.Pro" +
      "to.PowersOfAttorney.PowerOfAttorneyFullI" +
      "d\022\022\n\nUseDefault\030\002 \002(\010\022P\n\007Content\030\003 \001(\0132?" +
      ".Diadoc.Api.Proto.PowersOfAttorney.Power" +
      "OfAttorneySignedContent\022\022\n\nSendAsFile\030\004 " +
      "\001(\010B\035B\033PowerOfAttorneyToPostProtos"
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
          Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.getDescriptor(),
        }, assigner);
    internal_static_Diadoc_Api_Proto_Events_PowerOfAttorneyToPost_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_Events_PowerOfAttorneyToPost_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_Events_PowerOfAttorneyToPost_descriptor,
        new java.lang.String[] { "FullId", "UseDefault", "Content", "SendAsFile", });
    Diadoc.Api.Proto.PowersOfAttorney.PowerOfAttorneyProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
