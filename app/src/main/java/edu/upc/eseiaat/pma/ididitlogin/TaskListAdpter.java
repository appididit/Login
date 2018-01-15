package edu.upc.eseiaat.pma.ididitlogin;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;

import java.util.List;

import static java.security.AccessController.getContext;

/**
 * Created by Jordi1985 on 15/1/18.
 */



    public class TaskListAdapter extends ArrayAdapter<TaskItem> {
        public TaskListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List objects) {
            super(context, resource, objects);

        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View result = convertView;

            if (result==null){
                LayoutInflater inflater = LayoutInflater.from(getContext());
                result = inflater.inflate(R.layout.task_item,null);
            }
            CheckBox task_item = (CheckBox) result.findViewById(R.id.task_item);
            TaskItem item = getItem(position);
            task_item.setText(item.getText());
            task_item.setChecked(item.isChecked());
            return result;
        }
    }

