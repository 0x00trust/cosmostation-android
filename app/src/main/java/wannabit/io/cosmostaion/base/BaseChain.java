package wannabit.io.cosmostaion.base;

import static wannabit.io.cosmostaion.base.BaseConstant.TOKEN_HTLC_BINANCE_BNB;
import static wannabit.io.cosmostaion.base.BaseConstant.TOKEN_HTLC_BINANCE_BTCB;
import static wannabit.io.cosmostaion.base.BaseConstant.TOKEN_HTLC_BINANCE_BUSD;
import static wannabit.io.cosmostaion.base.BaseConstant.TOKEN_HTLC_BINANCE_XRPB;
import static wannabit.io.cosmostaion.base.BaseConstant.TOKEN_HTLC_KAVA_BNB;
import static wannabit.io.cosmostaion.base.BaseConstant.TOKEN_HTLC_KAVA_BTCB;
import static wannabit.io.cosmostaion.base.BaseConstant.TOKEN_HTLC_KAVA_BUSD;
import static wannabit.io.cosmostaion.base.BaseConstant.TOKEN_HTLC_KAVA_XRPB;

import java.util.ArrayList;

public enum BaseChain {
    // chain_id is checked on-chain. no need update chain version  21.03.20
    COSMOS_LEGACY1("cosmoshub-1"),
    COSMOS_LEGACY2("cosmoshub-2"),
    COSMOS_LEGACY3("cosmoshub-3"),
    COSMOS_LEGACY4("cosmoshub-4"),
    COSMOS_MAIN("cosmoshub-mainnet"),
    IRIS_LEGACY1("irishub"),
    IRIS_LEGACY2("irishub-1"),
    IRIS_MAIN("irishub-mainnet"),
    IOV_LEGACY1("iov-mainnet-2"),
    IOV_MAIN("iov-mainnet"),
    BNB_LEGACY1("Binance-Chain-Tigris"),
    BNB_MAIN("binance-mainnet"),
    KAVA_LEGACY1("kava-1"),
    KAVA_LEGACY2("kava-2"),
    KAVA_LEGACY3("kava-3"),
    KAVA_LEGACY4("kava-4"),
    KAVA_LEGACY5("kava-5"),
    KAVA_LEGACY6("kava-6"),
    KAVA_MAIN("kava-mainnet"),
    BAND_MAIN_LEGACY1("band-wenchang-mainnet"),
    BAND_MAIN_LEGACY2("band-guanyu-mainnet"),
    BAND_MAIN("band-mainnet"),
    CERTIK_LEGACY1("shentu-1"),
    CERTIK_LEGACY2("shentu-2"),
    CERTIK_MAIN("shentu-mainnet"),
    SECRET_LEGACY1("secret-2"),
    SECRET_MAIN("secret-mainnet"),
    AKASH_LEGACY1("akashnet-1"),
    AKASH_LEGACY2("akashnet-2"),
    AKASH_MAIN("akashnet-mainnet"),
    OKEX_LEGACY1("okexchain-66"),
    OKEX_MAIN("okexchain-mainnet"),
    PERSIS_MAIN("persistence-mainnet"),
    SENTINEL_MAIN("sentinel-mainnet"),
    FETCHAI_MAIN("fetchai-mainnet"),
    CRYPTO_MAIN("crytoorg-mainnet"),
    SIF_MAIN("sif-mainnet"),
    KI_MAIN("ki-mainnet"),
    OSMOSIS_MAIN("osmosis-mainnet"),
    MEDI_MAIN("medibloc-mainnet"),
    EMONEY_MAIN("emoney-mainnet"),
    RIZON_MAIN("rizon-mainnet"),
    JUNO_MAIN("juno-mainnet"),
    REGEN_MAIN("regen-mainnet"),
    BITCANNA_MAIN("bitcanna-mainnet"),
    ALTHEA_MAIN("althea-mainnet"),
    STARGAZE_MAIN("stargaze-mainnet"),
    GRABRIDGE_MAIN("GravityBridge-mainnet"),
    COMDEX_MAIN("comdex-mainnet"),
    INJ_MAIN("injective-mainnet"),
    BITSONG_MAIN("bitsong-mainnet"),
    DESMOS_MAIN("desmos-mainnet"),
    LUM_MAIN("lum-mainnet"),
    CHIHUAHUA_MAIN("chihuahua-mainnet"),
    AXELAR_MAIN("axelar-mainnet"),
    KONSTELL_MAIN("konstellation-mainnet"),
    UMEE_MAIN("umee-mainnet"),
    EVMOS_MAIN("evmos-mainnet"),
    CUDOS_MAIN("cudos-mainnet"),
    PROVENANCE_MAIN("provenance-mainnet"),
    CERBERUS_MAIN("cerberus-mainnet"),
    OMNIFLIX_MAIN("omniflix-mainnet"),
    CRESCENT_MAIN("crescent-mainnet"),
    ASSETMANTLE_MAIN("assetmantle-mainnet"),
    NYM_MAIN("nym-mainnet"),

    COSMOS_TEST_LEGACY1("stargate-final"),
    COSMOS_TEST("cosmos-testnet"),
    IRIS_TEST_LEGACY1("bifrost-2"),
    IRIS_TEST("iris-testnet"),
    OK_TEST("okexchain-testnet"),
    RIZON_TEST("rizon-testnet2"),
    ALTHEA_TEST("althea-testnet"),
    CRESCENT_TEST("crescent-testnet");

    private final String chainName;

    BaseChain(final String chainname) {
        this.chainName = chainname;
    }

    public String getChain() {
        return chainName;
    }

    public static BaseChain getChain(String chainName) {
        if (chainName.equals(COSMOS_LEGACY1.chainName) ||
                chainName.equals(COSMOS_LEGACY2.chainName) ||
                chainName.equals(COSMOS_LEGACY3.chainName) ||
                chainName.equals(COSMOS_LEGACY4.chainName) ||
                chainName.equals(COSMOS_MAIN.chainName)) {
            return COSMOS_MAIN;
        }
        if (chainName.equals(IRIS_LEGACY1.chainName) ||
                chainName.equals(IRIS_LEGACY2.chainName) ||
                chainName.equals(IRIS_MAIN.chainName)) {
            return IRIS_MAIN;
        }
        if (chainName.equals(BNB_LEGACY1.chainName) ||
                chainName.equals(BNB_MAIN.chainName)) {
            return BNB_MAIN;
        }
        if (chainName.equals(IOV_LEGACY1.chainName) ||
                chainName.equals(IOV_MAIN.chainName)) {
            return IOV_MAIN;
        }
        if (chainName.equals(KAVA_LEGACY1.chainName) ||
                chainName.equals(KAVA_LEGACY2.chainName) ||
                chainName.equals(KAVA_LEGACY3.chainName) ||
                chainName.equals(KAVA_LEGACY4.chainName) ||
                chainName.equals(KAVA_LEGACY5.chainName) ||
                chainName.equals(KAVA_LEGACY6.chainName) ||
                chainName.equals(KAVA_MAIN.chainName)) {
            return KAVA_MAIN;
        }
        if (chainName.equals(BAND_MAIN_LEGACY1.chainName) ||
                chainName.equals(BAND_MAIN_LEGACY2.chainName) ||
                chainName.equals(BAND_MAIN.chainName)) {
            return BAND_MAIN;
        }
        if (chainName.equals(CERTIK_LEGACY1.chainName) ||
                chainName.equals(CERTIK_MAIN.chainName)) {
            return CERTIK_MAIN;
        }
        if (chainName.equals(SECRET_LEGACY1.chainName) ||
                chainName.equals(SECRET_MAIN.chainName)) {
            return SECRET_MAIN;
        }
        if (chainName.equals(AKASH_LEGACY1.chainName) ||
                chainName.equals(AKASH_LEGACY2.chainName) ||
                chainName.equals(AKASH_MAIN.chainName)) {
            return AKASH_MAIN;
        }
        if (chainName.equals(OKEX_LEGACY1.chainName) ||
                chainName.equals(OKEX_MAIN.chainName)) {
            return OKEX_MAIN;
        }
        if (chainName.equals(PERSIS_MAIN.chainName)) {
            return PERSIS_MAIN;
        }
        if (chainName.equals(SENTINEL_MAIN.chainName)) {
            return SENTINEL_MAIN;
        }
        if (chainName.equals(FETCHAI_MAIN.chainName)) {
            return FETCHAI_MAIN;
        }
        if (chainName.equals(CRYPTO_MAIN.chainName)) {
            return CRYPTO_MAIN;
        }
        if (chainName.equals(SIF_MAIN.chainName)) {
            return SIF_MAIN;
        }
        if (chainName.equals(KI_MAIN.chainName)) {
            return KI_MAIN;
        }
        if (chainName.equals(OSMOSIS_MAIN.chainName)) {
            return OSMOSIS_MAIN;
        }
        if (chainName.equals(MEDI_MAIN.chainName)) {
            return MEDI_MAIN;
        }
        if (chainName.equals(EMONEY_MAIN.chainName)) {
            return EMONEY_MAIN;
        }
        if (chainName.equals(RIZON_MAIN.chainName)) {
            return RIZON_MAIN;
        }
        if (chainName.equals(JUNO_MAIN.chainName)) {
            return JUNO_MAIN;
        }
        if (chainName.equals(REGEN_MAIN.chainName)) {
            return REGEN_MAIN;
        }
        if (chainName.equals(BITCANNA_MAIN.chainName)) {
            return BITCANNA_MAIN;
        }
        if (chainName.equals(ALTHEA_MAIN.chainName)) {
            return ALTHEA_MAIN;
        }
        if (chainName.equals(STARGAZE_MAIN.chainName)) {
            return STARGAZE_MAIN;
        }
        if (chainName.equals(GRABRIDGE_MAIN.chainName)) {
            return GRABRIDGE_MAIN;
        }
        if (chainName.equals(COMDEX_MAIN.chainName)) {
            return COMDEX_MAIN;
        }
        if (chainName.equals(INJ_MAIN.chainName)) {
            return INJ_MAIN;
        }
        if (chainName.equals(BITSONG_MAIN.chainName)) {
            return BITSONG_MAIN;
        }
        if (chainName.equals(DESMOS_MAIN.chainName)) {
            return DESMOS_MAIN;
        }
        if (chainName.equals(LUM_MAIN.chainName)) {
            return LUM_MAIN;
        }
        if (chainName.equals(CHIHUAHUA_MAIN.chainName)) {
            return CHIHUAHUA_MAIN;
        }
        if (chainName.equals(AXELAR_MAIN.chainName)) {
            return AXELAR_MAIN;
        }
        if (chainName.equals(KONSTELL_MAIN.chainName)) {
            return KONSTELL_MAIN;
        }
        if (chainName.equals(UMEE_MAIN.chainName)) {
            return UMEE_MAIN;
        }
        if (chainName.equals(EVMOS_MAIN.chainName)) {
            return EVMOS_MAIN;
        }
        if (chainName.equals(CUDOS_MAIN.chainName)) {
            return CUDOS_MAIN;
        }
        if (chainName.equals(PROVENANCE_MAIN.chainName)) {
            return PROVENANCE_MAIN;
        }
        if (chainName.equals(CERBERUS_MAIN.chainName)) {
            return CERBERUS_MAIN;
        }
        if (chainName.equals(OMNIFLIX_MAIN.chainName)) {
            return OMNIFLIX_MAIN;
        }
        if (chainName.equals(CRESCENT_MAIN.chainName)) {
            return CRESCENT_MAIN;
        }
        if (chainName.equals(ASSETMANTLE_MAIN.chainName)) {
            return ASSETMANTLE_MAIN;
        }
        if (chainName.equals(NYM_MAIN.chainName)) {
            return NYM_MAIN;
        }

        if (chainName.equals(COSMOS_TEST_LEGACY1.chainName) ||
                chainName.equals(COSMOS_TEST.chainName)) {
            return COSMOS_TEST;
        }
        if (chainName.equals(IRIS_TEST_LEGACY1.chainName) ||
                chainName.equals(IRIS_TEST.chainName)) {
            return IRIS_TEST;
        }
        if (chainName.equals(CRESCENT_TEST.chainName)) {
            return CRESCENT_TEST;
        }

        return null;
    }

    public static ArrayList<BaseChain> SUPPORT_CHAINS() {
        ArrayList<BaseChain> result = new ArrayList<>();
        result.add(COSMOS_MAIN);
        result.add(IRIS_MAIN);
        result.add(AKASH_MAIN);
        result.add(ASSETMANTLE_MAIN);
        result.add(AXELAR_MAIN);
        result.add(BAND_MAIN);
        result.add(BNB_MAIN);
        result.add(BITCANNA_MAIN);
        result.add(BITSONG_MAIN);
        result.add(CERBERUS_MAIN);
        result.add(CERTIK_MAIN);
        result.add(CHIHUAHUA_MAIN);
        result.add(COMDEX_MAIN);
        result.add(CRESCENT_MAIN);
        result.add(CRYPTO_MAIN);
//        result.add(CUDOS_MAIN);
        result.add(DESMOS_MAIN);
        result.add(EMONEY_MAIN);
        result.add(EVMOS_MAIN);
        result.add(FETCHAI_MAIN);
        result.add(GRABRIDGE_MAIN);
        result.add(INJ_MAIN);
        result.add(JUNO_MAIN);
        result.add(KAVA_MAIN);
        result.add(KI_MAIN);
        result.add(KONSTELL_MAIN);
        result.add(LUM_MAIN);
        result.add(MEDI_MAIN);
        result.add(NYM_MAIN);
        result.add(OKEX_MAIN);
        result.add(OMNIFLIX_MAIN);
        result.add(OSMOSIS_MAIN);
        result.add(PERSIS_MAIN);
        result.add(PROVENANCE_MAIN);
        result.add(REGEN_MAIN);
        result.add(RIZON_MAIN);
        result.add(SECRET_MAIN);
        result.add(SENTINEL_MAIN);
        result.add(SIF_MAIN);
        result.add(STARGAZE_MAIN);
        result.add(IOV_MAIN);
        result.add(UMEE_MAIN);

//        result.add(CRESCENT_TEST);

//        result.add(ALTHEA_MAIN);
        return result;
    }

    public static boolean IS_SUPPORT_CHAIN(String chain) {
        return SUPPORT_CHAINS().contains(getChain(chain));
    }

    public static boolean IS_TESTNET(BaseChain chain) {
        if (chain.equals(ALTHEA_TEST) || chain.equals(CUDOS_MAIN) || chain.equals(CRESCENT_TEST)) {
            return true;
        }
        return false;
    }

    public static ArrayList<BaseChain> getHtlcSendable(BaseChain fromChain) {
        ArrayList<BaseChain> result = new ArrayList<>();
        if (fromChain.equals(KAVA_MAIN)) {
            result.add(BNB_MAIN);

        } else if (fromChain.equals(BNB_MAIN)) {
            result.add(KAVA_MAIN);

        }
        return result;
    }

    public static ArrayList<String>  getHtlcSwappableCoin(BaseChain fromChain) {
        ArrayList<String> result = new ArrayList<>();
        if (fromChain.equals(BNB_MAIN)) {
            result.add(TOKEN_HTLC_BINANCE_BNB);
            result.add(TOKEN_HTLC_BINANCE_BTCB);
            result.add(TOKEN_HTLC_BINANCE_XRPB);
            result.add(TOKEN_HTLC_BINANCE_BUSD);

        } else if (fromChain.equals(KAVA_MAIN)) {
            result.add(TOKEN_HTLC_KAVA_BNB);
            result.add(TOKEN_HTLC_KAVA_BTCB);
            result.add(TOKEN_HTLC_KAVA_XRPB);
            result.add(TOKEN_HTLC_KAVA_BUSD);

        }
        return result;
    }

    public static boolean isGRPC(BaseChain baseChain) {
        if (baseChain.equals(BNB_MAIN) || baseChain.equals(OKEX_MAIN)) {
            return false;
        }
        return true;
    }
}
