package p000a;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.widget.TextView;

/* renamed from: a.Fd */
/* loaded from: classes.dex */
public final class C0296Fd extends C0000A0 {
    @Override // p000a.AbstractC1075U9
    /* renamed from: h */
    public boolean mo625h(TextView textView) {
        boolean isHorizontallyScrollable;
        isHorizontallyScrollable = textView.isHorizontallyScrollable();
        return isHorizontallyScrollable;
    }

    @Override // p000a.C0000A0, p000a.AbstractC1075U9
    /* renamed from: z */
    public void mo0z(StaticLayout.Builder builder, TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        textDirectionHeuristic = textView.getTextDirectionHeuristic();
        builder.setTextDirection(textDirectionHeuristic);
    }
}
