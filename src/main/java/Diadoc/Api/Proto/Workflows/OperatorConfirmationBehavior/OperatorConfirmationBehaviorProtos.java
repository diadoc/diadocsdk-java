// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: Workflows/OperatorConfirmationBehavior.proto
// Protobuf Java Version: 4.28.3

package Diadoc.Api.Proto.Workflows.OperatorConfirmationBehavior;

public final class OperatorConfirmationBehaviorProtos {
  private OperatorConfirmationBehaviorProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      OperatorConfirmationBehaviorProtos.class.getName());
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
   * Protobuf enum {@code Diadoc.Api.Proto.Workflows.OperatorConfirmationBehavior.OperatorConfirmationBehavior}
   */
  public enum OperatorConfirmationBehavior
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Unknown = 0;</code>
     */
    Unknown(0),
    /**
     * <code>Never = 1;</code>
     */
    Never(1),
    /**
     * <code>Initiator = 2;</code>
     */
    Initiator(2),
    /**
     * <code>InitiatorCounterpart = 3;</code>
     */
    InitiatorCounterpart(3),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 3,
        /* suffix= */ "",
        OperatorConfirmationBehavior.class.getName());
    }
    /**
     * <code>Unknown = 0;</code>
     */
    public static final int Unknown_VALUE = 0;
    /**
     * <code>Never = 1;</code>
     */
    public static final int Never_VALUE = 1;
    /**
     * <code>Initiator = 2;</code>
     */
    public static final int Initiator_VALUE = 2;
    /**
     * <code>InitiatorCounterpart = 3;</code>
     */
    public static final int InitiatorCounterpart_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OperatorConfirmationBehavior valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static OperatorConfirmationBehavior forNumber(int value) {
      switch (value) {
        case 0: return Unknown;
        case 1: return Never;
        case 2: return Initiator;
        case 3: return InitiatorCounterpart;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<OperatorConfirmationBehavior>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        OperatorConfirmationBehavior> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<OperatorConfirmationBehavior>() {
            public OperatorConfirmationBehavior findValueByNumber(int number) {
              return OperatorConfirmationBehavior.forNumber(number);
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
      return Diadoc.Api.Proto.Workflows.OperatorConfirmationBehavior.OperatorConfirmationBehaviorProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final OperatorConfirmationBehavior[] VALUES = values();

    public static OperatorConfirmationBehavior valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private OperatorConfirmationBehavior(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Diadoc.Api.Proto.Workflows.OperatorConfirmationBehavior.OperatorConfirmationBehavior)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,Workflows/OperatorConfirmationBehavior" +
      ".proto\0227Diadoc.Api.Proto.Workflows.Opera" +
      "torConfirmationBehavior*_\n\034OperatorConfi" +
      "rmationBehavior\022\013\n\007Unknown\020\000\022\t\n\005Never\020\001\022" +
      "\r\n\tInitiator\020\002\022\030\n\024InitiatorCounterpart\020\003" +
      "B$B\"OperatorConfirmationBehaviorProtos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
