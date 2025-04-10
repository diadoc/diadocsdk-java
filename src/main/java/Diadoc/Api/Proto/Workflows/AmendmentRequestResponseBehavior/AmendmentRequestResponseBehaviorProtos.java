// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: Workflows/AmendmentRequestResponseBehavior.proto
// Protobuf Java Version: 4.28.3

package Diadoc.Api.Proto.Workflows.AmendmentRequestResponseBehavior;

public final class AmendmentRequestResponseBehaviorProtos {
  private AmendmentRequestResponseBehaviorProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      AmendmentRequestResponseBehaviorProtos.class.getName());
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
   * Protobuf enum {@code Diadoc.Api.Proto.Workflows.AmendmentRequestResponseBehavior.AmendmentRequestResponseBehavior}
   */
  public enum AmendmentRequestResponseBehavior
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Unknown = 0;</code>
     */
    Unknown(0),
    /**
     * <code>None = 1;</code>
     */
    None(1),
    /**
     * <code>Receipt = 2;</code>
     */
    Receipt(2),
    /**
     * <code>OperatorConfirmation = 3;</code>
     */
    OperatorConfirmation(3),
    /**
     * <code>OperatorConfirmationOrReceipt = 4;</code>
     */
    OperatorConfirmationOrReceipt(4),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 3,
        /* suffix= */ "",
        AmendmentRequestResponseBehavior.class.getName());
    }
    /**
     * <code>Unknown = 0;</code>
     */
    public static final int Unknown_VALUE = 0;
    /**
     * <code>None = 1;</code>
     */
    public static final int None_VALUE = 1;
    /**
     * <code>Receipt = 2;</code>
     */
    public static final int Receipt_VALUE = 2;
    /**
     * <code>OperatorConfirmation = 3;</code>
     */
    public static final int OperatorConfirmation_VALUE = 3;
    /**
     * <code>OperatorConfirmationOrReceipt = 4;</code>
     */
    public static final int OperatorConfirmationOrReceipt_VALUE = 4;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AmendmentRequestResponseBehavior valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AmendmentRequestResponseBehavior forNumber(int value) {
      switch (value) {
        case 0: return Unknown;
        case 1: return None;
        case 2: return Receipt;
        case 3: return OperatorConfirmation;
        case 4: return OperatorConfirmationOrReceipt;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AmendmentRequestResponseBehavior>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AmendmentRequestResponseBehavior> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AmendmentRequestResponseBehavior>() {
            public AmendmentRequestResponseBehavior findValueByNumber(int number) {
              return AmendmentRequestResponseBehavior.forNumber(number);
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
      return Diadoc.Api.Proto.Workflows.AmendmentRequestResponseBehavior.AmendmentRequestResponseBehaviorProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final AmendmentRequestResponseBehavior[] VALUES = values();

    public static AmendmentRequestResponseBehavior valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AmendmentRequestResponseBehavior(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Diadoc.Api.Proto.Workflows.AmendmentRequestResponseBehavior.AmendmentRequestResponseBehavior)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0Workflows/AmendmentRequestResponseBeha" +
      "vior.proto\022;Diadoc.Api.Proto.Workflows.A" +
      "mendmentRequestResponseBehavior*\203\001\n Amen" +
      "dmentRequestResponseBehavior\022\013\n\007Unknown\020" +
      "\000\022\010\n\004None\020\001\022\013\n\007Receipt\020\002\022\030\n\024OperatorConf" +
      "irmation\020\003\022!\n\035OperatorConfirmationOrRece" +
      "ipt\020\004B(B&AmendmentRequestResponseBehavio" +
      "rProtos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
