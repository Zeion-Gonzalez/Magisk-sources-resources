package p000a;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: a.kt */
/* loaded from: classes.dex */
public final class C1960kt extends AbstractC1034TO {

    /* renamed from: h */
    public List f6083h;

    /* renamed from: z */
    public final Paint f6084z;

    public C1960kt() {
        Paint paint = new Paint();
        this.f6084z = paint;
        this.f6083h = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // p000a.AbstractC1034TO
    /* renamed from: v */
    public final void mo1330v(Canvas canvas, RecyclerView recyclerView) {
        float m3677W;
        float f;
        float f2;
        Paint paint = this.f6084z;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        for (AbstractC2731zY abstractC2731zY : this.f6083h) {
            abstractC2731zY.getClass();
            ThreadLocal threadLocal = AbstractC0106C4.f396z;
            float f3 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f3)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f3)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f3)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f3))));
            boolean m5038Fu = ((CarouselLayoutManager) recyclerView.f9077J).m5038Fu();
            float f4 = 0.0f;
            abstractC2731zY.getClass();
            if (m5038Fu) {
                float m3676G = ((CarouselLayoutManager) recyclerView.f9077J).f9315q.m3676G();
                f = ((CarouselLayoutManager) recyclerView.f9077J).f9315q.m3679u();
                f2 = 0.0f;
                m3677W = 0.0f;
                f4 = m3676G;
            } else {
                float m3678o = ((CarouselLayoutManager) recyclerView.f9077J).f9315q.m3678o();
                m3677W = ((CarouselLayoutManager) recyclerView.f9077J).f9315q.m3677W();
                f = 0.0f;
                f2 = m3678o;
            }
            canvas.drawLine(f2, f4, m3677W, f, paint);
        }
    }
}
