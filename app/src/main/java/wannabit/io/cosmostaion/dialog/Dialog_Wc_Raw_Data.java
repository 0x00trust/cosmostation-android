package wannabit.io.cosmostaion.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

import wannabit.io.cosmostaion.R;
import wannabit.io.cosmostaion.activities.ConnectWalletActivity;

public class Dialog_Wc_Raw_Data extends DialogFragment {
    public WcSignRawDataListener listener = null;

    public static Dialog_Wc_Raw_Data newInstance(Bundle bundle, WcSignRawDataListener listener) {
        Dialog_Wc_Raw_Data dialog = new Dialog_Wc_Raw_Data();
        dialog.setArguments(bundle);
        dialog.listener = listener;
        return dialog;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_wc_raw_data, null);
        TextView raw_data = view.findViewById(R.id.wc_raw_data);
        Button btn_negative = view.findViewById(R.id.btn_nega);
        Button btn_positive = view.findViewById(R.id.btn_posi);

        String transaction = getArguments().getString("transaction");
        Long id = getArguments().getLong("id");
        int type = getArguments().getInt("type");
        raw_data.setText(new GsonBuilder().setPrettyPrinting().create().toJson(new JsonParser().parse(transaction)));

        btn_negative.setOnClickListener(v -> {
            if (listener != null) {
                listener.reject(id);
            }
            getDialog().dismiss();
        });

        btn_positive.setOnClickListener(v -> {
            if (listener != null) {
                listener.sign(type, id, transaction);
            }
            getDialog().dismiss();
        });

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(view);
        return builder.create();
    }

    public interface WcSignRawDataListener {
        void sign(int type, Long id, String transaction);

        void reject(Long id);
    }
}
