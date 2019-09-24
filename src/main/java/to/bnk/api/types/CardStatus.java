// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.types;

/**
 * Protobuf enum {@code types.CardStatus}
 */
public enum CardStatus
    implements com.google.protobuf.Internal.EnumLite {
  /**
   * <code>UnknownCardStatus = 0 [deprecated = false];</code>
   */
  UnknownCardStatus(0),
  /**
   * <code>Lock = 1 [deprecated = false];</code>
   */
  Lock(1),
  /**
   * <code>Unlock = 2 [deprecated = false];</code>
   */
  Unlock(2),
  /**
   * <code>Active = 3 [deprecated = false];</code>
   */
  Active(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UnknownCardStatus = 0 [deprecated = false];</code>
   */
  public static final int UnknownCardStatus_VALUE = 0;
  /**
   * <code>Lock = 1 [deprecated = false];</code>
   */
  public static final int Lock_VALUE = 1;
  /**
   * <code>Unlock = 2 [deprecated = false];</code>
   */
  public static final int Unlock_VALUE = 2;
  /**
   * <code>Active = 3 [deprecated = false];</code>
   */
  public static final int Active_VALUE = 3;


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
  public static CardStatus valueOf(int value) {
    return forNumber(value);
  }

  public static CardStatus forNumber(int value) {
    switch (value) {
      case 0: return UnknownCardStatus;
      case 1: return Lock;
      case 2: return Unlock;
      case 3: return Active;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CardStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CardStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CardStatus>() {
          @java.lang.Override
          public CardStatus findValueByNumber(int number) {
            return CardStatus.forNumber(number);
          }
        };

  public static com.google.protobuf.Internal.EnumVerifier 
      internalGetVerifier() {
    return CardStatusVerifier.INSTANCE;
  }

  private static final class CardStatusVerifier implements 
       com.google.protobuf.Internal.EnumVerifier { 
          static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new CardStatusVerifier();
          @java.lang.Override
          public boolean isInRange(int number) {
            return CardStatus.forNumber(number) != null;
          }
        };

  private final int value;

  private CardStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:types.CardStatus)
}

