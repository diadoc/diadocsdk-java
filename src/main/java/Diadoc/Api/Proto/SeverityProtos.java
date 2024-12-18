// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Severity.proto

package Diadoc.Api.Proto;

public final class SeverityProtos {
  private SeverityProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code Diadoc.Api.Proto.Severity}
   */
  public enum Severity
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UnknownSeverity = 0;</code>
     *
     * <pre>
     *reserved for backward compatibility
     * </pre>
     */
    UnknownSeverity(0, 0),
    /**
     * <code>Info = 1;</code>
     */
    Info(1, 1),
    /**
     * <code>Success = 2;</code>
     */
    Success(2, 2),
    /**
     * <code>Warning = 3;</code>
     */
    Warning(3, 3),
    /**
     * <code>Error = 4;</code>
     */
    Error(4, 4),
    ;

    /**
     * <code>UnknownSeverity = 0;</code>
     *
     * <pre>
     *reserved for backward compatibility
     * </pre>
     */
    public static final int UnknownSeverity_VALUE = 0;
    /**
     * <code>Info = 1;</code>
     */
    public static final int Info_VALUE = 1;
    /**
     * <code>Success = 2;</code>
     */
    public static final int Success_VALUE = 2;
    /**
     * <code>Warning = 3;</code>
     */
    public static final int Warning_VALUE = 3;
    /**
     * <code>Error = 4;</code>
     */
    public static final int Error_VALUE = 4;


    public final int getNumber() { return value; }

    public static Severity valueOf(int value) {
      switch (value) {
        case 0: return UnknownSeverity;
        case 1: return Info;
        case 2: return Success;
        case 3: return Warning;
        case 4: return Error;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Severity>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<Severity>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Severity>() {
            public Severity findValueByNumber(int number) {
              return Severity.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return Diadoc.Api.Proto.SeverityProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final Severity[] VALUES = values();

    public static Severity valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private Severity(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Diadoc.Api.Proto.Severity)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Severity.proto\022\020Diadoc.Api.Proto*N\n\010Se" +
      "verity\022\023\n\017UnknownSeverity\020\000\022\010\n\004Info\020\001\022\013\n" +
      "\007Success\020\002\022\013\n\007Warning\020\003\022\t\n\005Error\020\004B\020B\016Se" +
      "verityProtos"
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
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
