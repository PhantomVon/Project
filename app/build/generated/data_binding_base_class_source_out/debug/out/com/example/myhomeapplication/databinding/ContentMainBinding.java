// Generated by view binder compiler. Do not edit!
package com.example.myhomeapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myhomeapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ContentMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView agentsIcon;

  @NonNull
  public final ImageView apartmentIcon;

  @NonNull
  public final CardView btnExit;

  @NonNull
  public final CardView cardAgents;

  @NonNull
  public final ImageView exitIcon;

  @NonNull
  public final ImageView houseIcon;

  @NonNull
  public final TextView mtvAgents;

  @NonNull
  public final TextView mtvApartment;

  @NonNull
  public final TextView mtvExit;

  @NonNull
  public final TextView mtvHouses;

  @NonNull
  public final TextView mtvNotifications;

  @NonNull
  public final TextView mtvOwners;

  @NonNull
  public final TextView mtvTitle;

  @NonNull
  public final ImageView notificationIcon;

  @NonNull
  public final ImageView ownersIcon;

  private ContentMainBinding(@NonNull RelativeLayout rootView, @NonNull ImageView agentsIcon,
      @NonNull ImageView apartmentIcon, @NonNull CardView btnExit, @NonNull CardView cardAgents,
      @NonNull ImageView exitIcon, @NonNull ImageView houseIcon, @NonNull TextView mtvAgents,
      @NonNull TextView mtvApartment, @NonNull TextView mtvExit, @NonNull TextView mtvHouses,
      @NonNull TextView mtvNotifications, @NonNull TextView mtvOwners, @NonNull TextView mtvTitle,
      @NonNull ImageView notificationIcon, @NonNull ImageView ownersIcon) {
    this.rootView = rootView;
    this.agentsIcon = agentsIcon;
    this.apartmentIcon = apartmentIcon;
    this.btnExit = btnExit;
    this.cardAgents = cardAgents;
    this.exitIcon = exitIcon;
    this.houseIcon = houseIcon;
    this.mtvAgents = mtvAgents;
    this.mtvApartment = mtvApartment;
    this.mtvExit = mtvExit;
    this.mtvHouses = mtvHouses;
    this.mtvNotifications = mtvNotifications;
    this.mtvOwners = mtvOwners;
    this.mtvTitle = mtvTitle;
    this.notificationIcon = notificationIcon;
    this.ownersIcon = ownersIcon;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ContentMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ContentMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.content_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ContentMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.agents_icon;
      ImageView agentsIcon = ViewBindings.findChildViewById(rootView, id);
      if (agentsIcon == null) {
        break missingId;
      }

      id = R.id.apartment_icon;
      ImageView apartmentIcon = ViewBindings.findChildViewById(rootView, id);
      if (apartmentIcon == null) {
        break missingId;
      }

      id = R.id.btnExit;
      CardView btnExit = ViewBindings.findChildViewById(rootView, id);
      if (btnExit == null) {
        break missingId;
      }

      id = R.id.cardAgents;
      CardView cardAgents = ViewBindings.findChildViewById(rootView, id);
      if (cardAgents == null) {
        break missingId;
      }

      id = R.id.exit_icon;
      ImageView exitIcon = ViewBindings.findChildViewById(rootView, id);
      if (exitIcon == null) {
        break missingId;
      }

      id = R.id.house_icon;
      ImageView houseIcon = ViewBindings.findChildViewById(rootView, id);
      if (houseIcon == null) {
        break missingId;
      }

      id = R.id.mtvAgents;
      TextView mtvAgents = ViewBindings.findChildViewById(rootView, id);
      if (mtvAgents == null) {
        break missingId;
      }

      id = R.id.mtvApartment;
      TextView mtvApartment = ViewBindings.findChildViewById(rootView, id);
      if (mtvApartment == null) {
        break missingId;
      }

      id = R.id.mtvExit;
      TextView mtvExit = ViewBindings.findChildViewById(rootView, id);
      if (mtvExit == null) {
        break missingId;
      }

      id = R.id.mtvHouses;
      TextView mtvHouses = ViewBindings.findChildViewById(rootView, id);
      if (mtvHouses == null) {
        break missingId;
      }

      id = R.id.mtvNotifications;
      TextView mtvNotifications = ViewBindings.findChildViewById(rootView, id);
      if (mtvNotifications == null) {
        break missingId;
      }

      id = R.id.mtvOwners;
      TextView mtvOwners = ViewBindings.findChildViewById(rootView, id);
      if (mtvOwners == null) {
        break missingId;
      }

      id = R.id.mtvTitle;
      TextView mtvTitle = ViewBindings.findChildViewById(rootView, id);
      if (mtvTitle == null) {
        break missingId;
      }

      id = R.id.notification_icon;
      ImageView notificationIcon = ViewBindings.findChildViewById(rootView, id);
      if (notificationIcon == null) {
        break missingId;
      }

      id = R.id.owners_icon;
      ImageView ownersIcon = ViewBindings.findChildViewById(rootView, id);
      if (ownersIcon == null) {
        break missingId;
      }

      return new ContentMainBinding((RelativeLayout) rootView, agentsIcon, apartmentIcon, btnExit,
          cardAgents, exitIcon, houseIcon, mtvAgents, mtvApartment, mtvExit, mtvHouses,
          mtvNotifications, mtvOwners, mtvTitle, notificationIcon, ownersIcon);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
