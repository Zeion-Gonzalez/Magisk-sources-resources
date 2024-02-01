package p000a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.topjohnwu.magisk.R;
import java.util.Locale;

/* renamed from: a.Vo */
/* loaded from: classes.dex */
public final class C1165Vo extends AbstractC0408Hk {

    /* renamed from: P */
    public final C2292rA f3793P;

    public C1165Vo(C2292rA c2292rA) {
        this.f3793P = c2292rA;
    }

    @Override // p000a.AbstractC0408Hk
    /* renamed from: N */
    public final void mo912N(AbstractC0249El abstractC0249El, int i) {
        String format;
        C2292rA c2292rA = this.f3793P;
        int i2 = c2292rA.f7083U8.f7412S.f1062w + i;
        String format2 = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((C2506vB) abstractC0249El).f7674s;
        textView.setText(format2);
        Context context = textView.getContext();
        if (AbstractC2674yV.m4587v().get(1) == i2) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2));
        }
        textView.setContentDescription(format);
        C0407Hj c0407Hj = c2292rA.f7085dx;
        if (AbstractC2674yV.m4587v().get(1) == i2) {
            C2226py c2226py = c0407Hj.f1372h;
        } else {
            C2226py c2226py2 = c0407Hj.f1373z;
        }
        throw null;
    }

    @Override // p000a.AbstractC0408Hk
    /* renamed from: Q */
    public final AbstractC0249El mo914Q(RecyclerView recyclerView, int i) {
        return new C2506vB((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_year, (ViewGroup) recyclerView, false));
    }

    @Override // p000a.AbstractC0408Hk
    /* renamed from: z */
    public final int mo918z() {
        return this.f3793P.f7083U8.f7414k;
    }
}
