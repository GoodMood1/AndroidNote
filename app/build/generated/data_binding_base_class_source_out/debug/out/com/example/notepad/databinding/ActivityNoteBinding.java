// Generated by view binder compiler. Do not edit!
package com.example.notepad.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.notepad.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNoteBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText textNote;

  @NonNull
  public final TextView timeNote;

  @NonNull
  public final EditText titleNote;

  private ActivityNoteBinding(@NonNull ConstraintLayout rootView, @NonNull EditText textNote,
      @NonNull TextView timeNote, @NonNull EditText titleNote) {
    this.rootView = rootView;
    this.textNote = textNote;
    this.timeNote = timeNote;
    this.titleNote = titleNote;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_note, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNoteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.textNote;
      EditText textNote = ViewBindings.findChildViewById(rootView, id);
      if (textNote == null) {
        break missingId;
      }

      id = R.id.timeNote;
      TextView timeNote = ViewBindings.findChildViewById(rootView, id);
      if (timeNote == null) {
        break missingId;
      }

      id = R.id.titleNote;
      EditText titleNote = ViewBindings.findChildViewById(rootView, id);
      if (titleNote == null) {
        break missingId;
      }

      return new ActivityNoteBinding((ConstraintLayout) rootView, textNote, timeNote, titleNote);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
