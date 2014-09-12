/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.nasoft.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.PathSegment;
import persistence.Usrmobiletbl;
import persistence.UsrmobiletblPK;

/**
 *
 * @author Luis Alfredo Moctezu
 */
@Stateless
@Path("persistence.usrmobiletbl")
public class UsrmobiletblFacadeREST extends AbstractFacade<Usrmobiletbl> {
    @PersistenceContext(unitName = "com_test-nasoft_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    private UsrmobiletblPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;id=idValue;idUser=idUserValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        persistence.UsrmobiletblPK key = new persistence.UsrmobiletblPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> id = map.get("id");
        if (id != null && !id.isEmpty()) {
            key.setId(new java.lang.Integer(id.get(0)));
        }
        java.util.List<String> idUser = map.get("idUser");
        if (idUser != null && !idUser.isEmpty()) {
            key.setIdUser(new java.lang.Integer(idUser.get(0)));
        }
        return key;
    }

    public UsrmobiletblFacadeREST() {
        super(Usrmobiletbl.class);
    }

    @POST
    @Override
    @Consumes({"application/json"})
    public void create(Usrmobiletbl entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/json"})
    public void edit(@PathParam("id") PathSegment id, Usrmobiletbl entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        persistence.UsrmobiletblPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({"application/json"})
    public Usrmobiletbl find(@PathParam("id") PathSegment id) {
        persistence.UsrmobiletblPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({"application/json"})
    public List<Usrmobiletbl> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/json"})
    public List<Usrmobiletbl> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
