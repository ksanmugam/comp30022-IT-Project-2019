package com.example.keepsake;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FamilyViewHolder extends RecyclerView.ViewHolder {
    private View mView;
    private TextView familyNameText;
    private TextView familyIDText;
    private Button joinButton;

    public FamilyViewHolder(@NonNull View itemView) {
        super(itemView);
        mView = itemView;
    }

    public void bind(Family family){
        familyNameText = mView.findViewById(R.id.textViewFamilyName);
        familyIDText = mView.findViewById(R.id.textViewFamilyID);
        joinButton = mView.findViewById(R.id.buttonJoin);

        familyNameText.setText(family.getFamilyName());
        familyIDText.setText(family.getFamilyID());
    }

    public void setOnClickListener(View.OnClickListener listener){
        //mView.setOnClickListener(listener);
    }

    public void setButtonOnClickListener(View.OnClickListener listener){
        joinButton.setOnClickListener(listener);
    }

    public View getView(){
        return mView;
    }

    public void setButtonVisibility(int v){
        joinButton.setVisibility(v);
    }

}