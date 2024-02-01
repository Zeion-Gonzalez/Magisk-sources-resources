package p000a;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* renamed from: a.Th */
/* loaded from: classes.dex */
public final class C1051Th implements Comparator {

    /* renamed from: h */
    public final /* synthetic */ Object f3474h;

    /* renamed from: z */
    public final /* synthetic */ int f3475z;

    public /* synthetic */ C1051Th(int i, Object obj) {
        this.f3475z = i;
        this.f3474h = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3475z) {
            case AbstractC0795Op.f2698E /* 0 */:
                return ((C2598ww) obj).f7992R - ((C2598ww) obj2).f7992R;
            default:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
                if (compareTo == 0) {
                    int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                    if (compareTo2 == 0) {
                        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f3474h;
                        return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
                    }
                    return compareTo2;
                }
                return compareTo;
        }
    }
}
