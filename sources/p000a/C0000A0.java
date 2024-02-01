package p000a;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* renamed from: a.A0 */
/* loaded from: classes.dex */
public class C0000A0 extends AbstractC1075U9 {
    @Override // p000a.AbstractC1075U9
    /* renamed from: z */
    public void mo0z(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C0180DU.m351N(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
