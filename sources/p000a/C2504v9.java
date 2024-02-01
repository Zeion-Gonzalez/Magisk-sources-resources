package p000a;

import android.util.Property;
import android.view.ViewGroup;
import com.topjohnwu.magisk.R;

/* renamed from: a.v9 */
/* loaded from: classes.dex */
public final class C2504v9 extends Property {

    /* renamed from: z */
    public static final C2504v9 f7673z = new C2504v9();

    public C2504v9() {
        super(Float.class, "childrenAlpha");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        Float f = (Float) ((ViewGroup) obj).getTag(R.id.mtrl_internal_children_alpha_tag);
        if (f == null) {
            return Float.valueOf(1.0f);
        }
        return f;
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        float floatValue = ((Float) obj2).floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
