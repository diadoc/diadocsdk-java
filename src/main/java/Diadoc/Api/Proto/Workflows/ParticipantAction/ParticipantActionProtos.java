// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: Workflows/ParticipantAction.proto
// Protobuf Java Version: 4.28.1

package Diadoc.Api.Proto.Workflows.ParticipantAction;

public final class ParticipantActionProtos {
  private ParticipantActionProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      ParticipantActionProtos.class.getName());
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
   * Protobuf enum {@code Diadoc.Api.Proto.Workflows.ParticipantAction.ParticipantAction}
   */
  public enum ParticipantAction
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Unknown = 0;</code>
     */
    Unknown(0),
    /**
     * <code>Title = 1;</code>
     */
    Title(1),
    /**
     * <code>Signature = 2;</code>
     */
    Signature(2),
    /**
     * <code>OptionalSignature = 3;</code>
     */
    OptionalSignature(3),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 1,
        /* suffix= */ "",
        ParticipantAction.class.getName());
    }
    /**
     * <code>Unknown = 0;</code>
     */
    public static final int Unknown_VALUE = 0;
    /**
     * <code>Title = 1;</code>
     */
    public static final int Title_VALUE = 1;
    /**
     * <code>Signature = 2;</code>
     */
    public static final int Signature_VALUE = 2;
    /**
     * <code>OptionalSignature = 3;</code>
     */
    public static final int OptionalSignature_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ParticipantAction valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ParticipantAction forNumber(int value) {
      switch (value) {
        case 0: return Unknown;
        case 1: return Title;
        case 2: return Signature;
        case 3: return OptionalSignature;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ParticipantAction>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ParticipantAction> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ParticipantAction>() {
            public ParticipantAction findValueByNumber(int number) {
              return ParticipantAction.forNumber(number);
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
      return Diadoc.Api.Proto.Workflows.ParticipantAction.ParticipantActionProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final ParticipantAction[] VALUES = values();

    public static ParticipantAction valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ParticipantAction(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Diadoc.Api.Proto.Workflows.ParticipantAction.ParticipantAction)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!Workflows/ParticipantAction.proto\022,Dia" +
      "doc.Api.Proto.Workflows.ParticipantActio" +
      "n*Q\n\021ParticipantAction\022\013\n\007Unknown\020\000\022\t\n\005T" +
      "itle\020\001\022\r\n\tSignature\020\002\022\025\n\021OptionalSignatu" +
      "re\020\003B\031B\027ParticipantActionProtos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
