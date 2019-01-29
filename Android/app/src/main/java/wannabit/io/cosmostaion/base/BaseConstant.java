package wannabit.io.cosmostaion.base;

public class BaseConstant {
    public final static boolean                 IS_SHOWLOG 					            = true;
    public final static String                  LOG_TAG                                 = "Cosmostation";

    public final static String					DB_NAME			                        = "WannaBit";
    public final static int					    DB_VERSION			                    = 1;
    public final static String					DB_TABLE_PASSWORD			            = "paswd";
    public final static String					DB_TABLE_MNEMONIC			            = "mnemc";
    public final static String					DB_TABLE_ACCOUNT			            = "accnt";
    public final static String					DB_TABLE_BALANCE			            = "balan";
    public final static String					DB_TABLE_TRANSACTION			        = "tranx";
    public final static String					DB_TABLE_PRICE			                = "price";


    public final static String                  COSMOS_MSG_TYPE_TRANSFER                = "cosmos-sdk/Send";
    public final static String                  COSMOS_MSG_TYPE_DELEGATE                = "cosmos-sdk/MsgDelegate";
    public final static String                  COSMOS_MSG_TYPE_UNDELEGATE              = "cosmos-sdk/Undelegate";
    public final static String                  COSMOS_MSG_TYPE_REDELEGATE              = "cosmos-sdk/BeginRedelegate";
    public final static String                  COSMOS_MSG_TYPE_WITHDRAW_DEL            = "cosmos-sdk/MsgWithdrawDelegationReward";
    public final static String                  COSMOS_MSG_TYPE_WITHDRAW_VAL            = "cosmos-sdk/MsgWithdrawValidatorCommission";
    public final static String                  COSMOS_MSG_TYPE_WITHDRAW_MIDIFY         = "cosmos-sdk/MsgModifyWithdrawAddress";


    public final static String                  COSMOS_AUTH_TYPE_STDTX                  = "auth/StdTx";

    public final static String                  COSMOS_KEY_TYPE_PUBLIC                  = "tendermint/PubKeySecp256k1";
}
