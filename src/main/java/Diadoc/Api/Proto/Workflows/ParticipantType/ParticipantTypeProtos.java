// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: Workflows/ParticipantType.proto
// Protobuf Java Version: 4.28.1

package Diadoc.Api.Proto.Workflows.ParticipantType;

public final class ParticipantTypeProtos {
  private ParticipantTypeProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      ParticipantTypeProtos.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code Diadoc.Api.Proto.Workflows.ParticipantType.ParticipantType}
   */
  public enum ParticipantType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Unknown = 0;</code>
     */
    Unknown(0),
    /**
     * <code>Sender = 1;</code>
     */
    Sender(1),
    /**
     * <code>Proxy = 2;</code>
     */
    Proxy(2),
    /**
     * <code>Recipient = 3;</code>
     */
    Recipient(3),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 1,
        /* suffix= */ "",
        ParticipantType.class.getName());
    }
    /**
     * <code>Unknown = 0;</code>
     */
    public static final int Unknown_VALUE = 0;
    /**
     * <code>Sender = 1;</code>
     */
    public static final int Sender_VALUE = 1;
    /**
     * <code>Proxy = 2;</code>
     */
    public static final int Proxy_VALUE = 2;
    /**
     * <code>Recipient = 3;</code>
     */
    public static final int Recipient_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ParticipantType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ParticipantType forNumber(int value) {
      switch (value) {
        case 0: return Unknown;
        case 1: return Sender;
        case 2: return Proxy;
        case 3: return Recipient;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ParticipantType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ParticipantType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ParticipantType>() {
            public ParticipantType findValueByNumber(int number) {
              return ParticipantType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return Diadoc.Api.Proto.Workflows.ParticipantType.ParticipantTypeProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final ParticipantType[] VALUES = values();

    public static ParticipantType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ParticipantType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Diadoc.Api.Proto.Workflows.ParticipantType.ParticipantType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037Workflows/ParticipantType.proto\022*Diado" +
      "c.Api.Proto.Workflows.ParticipantType*D\n" +
      "\017ParticipantType\022\013\n\007Unknown\020\000\022\n\n\006Sender\020" +
      "\001\022\t\n\005Proxy\020\002\022\r\n\tRecipient\020\003B\027B\025Participa" +
      "ntTypeProtos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
