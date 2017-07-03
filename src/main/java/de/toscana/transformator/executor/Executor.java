package de.toscana.transformator.executor;

import com.jcraft.jsch.JSchException;

import java.io.File;
import java.util.Map;

/**
 * Created by oliver on 22.06.2017.
 */
public interface Executor {

    /**
     * executes the script
     *
     * @param script expects nodename/scriptname
     * @param environment environment variables
     * @return the output generated by running given script on target
     */
     String executeScript(String script, Map<String, String> environment) throws JSchException;

    /**
     * Uploads the file to the machine and unzips it
     *
     * @param file expects a .zip file
     * @return the output generated by running given script on target
     */
    String uploadAndUnzipZip(File file) throws JSchException;

    /**
     * Begins a ssh connection
     * return true if successful, else false
     */
    boolean connect();

    /**
     * Closes the current ssh connection
     */
    void close();

}