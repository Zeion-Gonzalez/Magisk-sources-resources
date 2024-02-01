package p000a;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* renamed from: a.s5 */
/* loaded from: classes.dex */
public final class C2344s5 implements InterfaceC0076BT {
    /* renamed from: z */
    public final C0671Mh m4020z(View view, C0671Mh c0671Mh) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0671Mh);
        }
        if (c0671Mh.f2212z.mo1118u() == 2) {
            return c0671Mh;
        }
        InterfaceC0460Ii interfaceC0460Ii = c0671Mh.f2212z;
        ClipData mo1119z = interfaceC0460Ii.mo1119z();
        int mo1116P = interfaceC0460Ii.mo1116P();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < mo1119z.getItemCount(); i++) {
            ClipData.Item itemAt = mo1119z.getItemAt(i);
            if ((mo1116P & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (!z) {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                }
            }
        }
        return null;
    }
}
