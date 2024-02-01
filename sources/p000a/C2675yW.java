package p000a;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.topjohnwu.magisk.R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: a.yW */
/* loaded from: classes.dex */
public final class C2675yW extends BaseAdapter {

    /* renamed from: P */
    public static final int f8347P;

    /* renamed from: h */
    public final int f8348h;

    /* renamed from: v */
    public final int f8349v;

    /* renamed from: z */
    public final Calendar f8350z;

    static {
        f8347P = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C2675yW() {
        Calendar m4585P = AbstractC2674yV.m4585P(null);
        this.f8350z = m4585P;
        this.f8348h = m4585P.getMaximum(7);
        this.f8349v = m4585P.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f8348h;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.f8348h;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f8349v;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.f8349v;
        int i3 = this.f8348h;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f8350z;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, f8347P, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C2675yW(int i) {
        Calendar m4585P = AbstractC2674yV.m4585P(null);
        this.f8350z = m4585P;
        this.f8348h = m4585P.getMaximum(7);
        this.f8349v = i;
    }
}
