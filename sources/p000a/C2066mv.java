package p000a;

import android.content.Context;
import android.widget.ArrayAdapter;

/* renamed from: a.mv */
/* loaded from: classes.dex */
public final class C2066mv extends ArrayAdapter {
    public C2066mv(Context context, int i) {
        super(context, i, 16908308, (Object[]) null);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
