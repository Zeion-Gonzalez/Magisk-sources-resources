package p000a;

import android.app.Activity;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: a.pc */
/* loaded from: classes.dex */
public abstract class AbstractC2209pc {
    /* renamed from: h */
    public static boolean m3849h(DragEvent dragEvent, View view, Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        AbstractC2446u3.m4224o(view, ((InterfaceC1792hi) new C2196pM(dragEvent.getClipData(), 3).f6755R).mo3071h());
        return true;
    }

    /* renamed from: z */
    public static boolean m3850z(DragEvent dragEvent, TextView textView, Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            AbstractC2446u3.m4224o(textView, ((InterfaceC1792hi) new C2196pM(dragEvent.getClipData(), 3).f6755R).mo3071h());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }
}
