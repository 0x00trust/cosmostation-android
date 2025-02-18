package wannabit.io.cosmostaion.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import wannabit.io.cosmostaion.R;

public class CommonAlertDialog extends AlertDialog {
    TextView titleTextView;
    TextView messageTextView;
    Button rightButton;
    Button leftButton;
    ImageView headerImageView;

    public CommonAlertDialog(Context context) {
        super(context);
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_template, null);

        headerImageView = view.findViewById(R.id.dialog_header_image);
        titleTextView = view.findViewById(R.id.dialog_title);
        messageTextView = view.findViewById(R.id.dialog_msg);
        rightButton = view.findViewById(R.id.btn_right);
        leftButton = view.findViewById(R.id.btn_left);
        setView(view);
    }
}