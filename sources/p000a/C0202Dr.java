package p000a;

import android.os.Build;
import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.C2773v;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: a.Dr */
/* loaded from: classes.dex */
public final class C0202Dr extends AbstractC1467ba {

    /* renamed from: h */
    public final /* synthetic */ MaterialButton f608h;

    /* renamed from: v */
    public final /* synthetic */ C2292rA f609v;

    /* renamed from: z */
    public final /* synthetic */ C2773v f610z;

    public C0202Dr(C2292rA c2292rA, C2773v c2773v, MaterialButton materialButton) {
        this.f609v = c2292rA;
        this.f610z = c2773v;
        this.f608h = materialButton;
    }

    @Override // p000a.AbstractC1467ba
    /* renamed from: h */
    public final void mo102h(RecyclerView recyclerView, int i, int i2) {
        int m4873S3;
        String formatDateTime;
        C2292rA c2292rA = this.f609v;
        if (i < 0) {
            m4873S3 = ((LinearLayoutManager) c2292rA.f7081Lq.f9077J).m4877W9();
        } else {
            m4873S3 = ((LinearLayoutManager) c2292rA.f7081Lq.f9077J).m4873S3();
        }
        C2773v c2773v = this.f610z;
        Calendar m4586h = AbstractC2674yV.m4586h(c2773v.f9339P.f7412S.f1058S);
        m4586h.add(2, m4873S3);
        c2292rA.f7077BO = new C0307Fr(m4586h);
        Calendar m4586h2 = AbstractC2674yV.m4586h(c2773v.f9339P.f7412S.f1058S);
        m4586h2.add(2, m4873S3);
        m4586h2.set(5, 1);
        Calendar m4586h3 = AbstractC2674yV.m4586h(m4586h2);
        m4586h3.get(2);
        m4586h3.get(1);
        m4586h3.getMaximum(7);
        m4586h3.getActualMaximum(5);
        m4586h3.getTimeInMillis();
        long timeInMillis = m4586h3.getTimeInMillis();
        if (Build.VERSION.SDK_INT >= 24) {
            formatDateTime = AbstractC2674yV.m4588z("yMMMM", Locale.getDefault()).format(new Date(timeInMillis));
        } else {
            formatDateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        this.f608h.setText(formatDateTime);
    }

    @Override // p000a.AbstractC1467ba
    /* renamed from: z */
    public final void mo103z(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f608h.getText());
        }
    }
}
