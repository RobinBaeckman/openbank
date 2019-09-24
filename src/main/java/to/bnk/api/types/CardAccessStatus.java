// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.types;

/**
 * Protobuf enum {@code types.CardAccessStatus}
 */
public enum CardAccessStatus
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <code>UnknownCardAccessStatus = 0 [deprecated = false];</code>
   */
  UnknownCardAccessStatus(0),
  /**
   * <code>Often = 1 [deprecated = false];</code>
   */
  Often(1),
  /**
   * <code>Rare = 2 [deprecated = false];</code>
   */
  Rare(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UnknownCardAccessStatus = 0 [deprecated = false];</code>
   */
  public static final int UnknownCardAccessStatus_VALUE = 0;
  /**
   * <code>Often = 1 [deprecated = false];</code>
   */
  public static final int Often_VALUE = 1;
  /**
   * <code>Rare = 2 [deprecated = false];</code>
   */
  public static final int Rare_VALUE = 2;


  @java.lang.Override
  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static CardAccessStatus valueOf(int value) {
    return forNumber(value);
  }

  public static CardAccessStatus forNumber(int value) {
    switch (value) {
      case 0: return UnknownCardAccessStatus;
      case 1: return Often;
      case 2: return Rare;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CardAccessStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CardAccessStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CardAccessStatus>() {
          @java.lang.Override
          public CardAccessStatus findValueByNumber(int number) {
            return CardAccessStatus.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return CardAccessStatusVerifier.INSTANCE;
  }

  private static final class CardAccessStatusVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new CardAccessStatusVerifier();
          @java.lang.Override
          public boolean isInRange(int number) {
            return CardAccessStatus.forNumber(number) != null;
          }
        };

  private final int value;

  private CardAccessStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:types.CardAccessStatus)
}

