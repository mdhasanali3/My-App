package com.example.myapplicatio;

import com.google.ar.core.Config;
import com.google.ar.core.Session;
import com.google.ar.sceneform.ux.ArFragment;

public class customarFragment extends ArFragment {
    @Override
    protected Config getSessionConfiguration(Session session) {
        Config config =new config(session);

        config.setUpdateMode(config.UpdateMode.LATEST_CAMERA_IMAGE);
        config.setFocusMode(config.FocusMode.AUTO);
        session.configure(config);
        this.getArSceneView().setupSession(session);

        ((MainActivity) getActivity()).setupdatabase(config,session);

        return  config;


    }
}
