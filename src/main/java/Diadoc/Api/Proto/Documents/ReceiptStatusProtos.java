// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: Documents/ReceiptStatus.proto
// Protobuf Java Version: 4.28.1

package Diadoc.Api.Proto.Documents;

public final class ReceiptStatusProtos {
  private ReceiptStatusProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      ReceiptStatusProtos.class.getName());
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
   * Protobuf enum {@code Diadoc.Api.Proto.Documents.ReceiptStatus}
   */
  public enum ReceiptStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Reserved state to report to legacy client for new statuses
     * </pre>
     *
     * <code>UnknownReceiptStatus = 0;</code>
     */
    UnknownReceiptStatus(0),
    /**
     * <code>ReceiptStatusNone = 1;</code>
     */
    ReceiptStatusNone(1),
    /**
     * <code>ReceiptStatusFinished = 2;</code>
     */
    ReceiptStatusFinished(2),
    /**
     * <code>ReceiptStatusHaveToCreateReceipt = 3;</code>
     */
    ReceiptStatusHaveToCreateReceipt(3),
    /**
     * <code>ReceiptStatusWaitingForReceipt = 4;</code>
     */
    ReceiptStatusWaitingForReceipt(4),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 1,
        /* suffix= */ "",
        ReceiptStatus.class.getName());
    }
    /**
     * <pre>
     * Reserved state to report to legacy client for new statuses
     * </pre>
     *
     * <code>UnknownReceiptStatus = 0;</code>
     */
    public static final int UnknownReceiptStatus_VALUE = 0;
    /**
     * <code>ReceiptStatusNone = 1;</code>
     */
    public static final int ReceiptStatusNone_VALUE = 1;
    /**
     * <code>ReceiptStatusFinished = 2;</code>
     */
    public static final int ReceiptStatusFinished_VALUE = 2;
    /**
     * <code>ReceiptStatusHaveToCreateReceipt = 3;</code>
     */
    public static final int ReceiptStatusHaveToCreateReceipt_VALUE = 3;
    /**
     * <code>ReceiptStatusWaitingForReceipt = 4;</code>
     */
    public static final int ReceiptStatusWaitingForReceipt_VALUE = 4;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ReceiptStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ReceiptStatus forNumber(int value) {
      switch (value) {
        case 0: return UnknownReceiptStatus;
        case 1: return ReceiptStatusNone;
        case 2: return ReceiptStatusFinished;
        case 3: return ReceiptStatusHaveToCreateReceipt;
        case 4: return ReceiptStatusWaitingForReceipt;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ReceiptStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ReceiptStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ReceiptStatus>() {
            public ReceiptStatus findValueByNumber(int number) {
              return ReceiptStatus.forNumber(number);
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
      return Diadoc.Api.Proto.Documents.ReceiptStatusProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final ReceiptStatus[] VALUES = values();

    public static ReceiptStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ReceiptStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Diadoc.Api.Proto.Documents.ReceiptStatus)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035Documents/ReceiptStatus.proto\022\032Diadoc." +
      "Api.Proto.Documents*\245\001\n\rReceiptStatus\022\030\n" +
      "\024UnknownReceiptStatus\020\000\022\025\n\021ReceiptStatus" +
      "None\020\001\022\031\n\025ReceiptStatusFinished\020\002\022$\n Rec" +
      "eiptStatusHaveToCreateReceipt\020\003\022\"\n\036Recei" +
      "ptStatusWaitingForReceipt\020\004B\025B\023ReceiptSt" +
      "atusProtos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
