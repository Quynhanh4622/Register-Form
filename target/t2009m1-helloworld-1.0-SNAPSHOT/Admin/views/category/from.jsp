<!doctype html>
<html lang="en">
<jsp:include page="/Admin/components/head.jsp">
    <jsp:param name="head" value="from"/>
</jsp:include>
<body>
<jsp:include page="/Admin/components/sidebar.jsp"/>
<jsp:include page="/Admin/components/navbar.jsp"/>
<div class="all-content-wrapper">
    <div class="breadcome-area" style="padding-top: 60px" >
        <div class="container-fluid">
<div class="row" >
    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
        <div class="sparkline12-list">
            <div class="sparkline12-hd">
                <div class="main-sparkline12-hd">
                    <h1>All Form Element</h1>
                </div>
            </div>
            <div class="sparkline12-graph">
                <div class="basic-login-form-ad">
                    <div class="row">
                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                            <div class="all-form-element-inner">
                                <form action="post">
                                    <div class="form-group-inner">
                                        <div class="row">
                                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                                                <label class="login2 pull-right pull-right-pro">Id</label>
                                            </div>
                                            <div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">
                                                <input type="text" class="form-control" />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group-inner">
                                        <div class="row">
                                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                                                <label class="login2 pull-right pull-right-pro">Name</label>
                                            </div>
                                            <div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">
                                                <input type="text" class="form-control" />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group-inner">
                                        <div class="row">
                                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                                                <label class="login2 pull-right pull-right-pro">Status</label>
                                            </div>
                                            <div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">
                                                <input type="text" class="form-control" />
                                            </div>
                                        </div>
                                    </div>

<%--                                    <div class="form-group-inner">--%>
<%--                                        <div class="row">--%>
<%--                                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">--%>
<%--                                                <label class="login2 pull-right pull-right-pro">Username</label>--%>
<%--                                            </div>--%>
<%--                                            <div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">--%>
<%--                                                <input type="text" class="form-control" />--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                    <div class="form-group-inner">--%>
<%--                                        <div class="row">--%>
<%--                                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">--%>
<%--                                                <label class="login2 pull-right pull-right-pro">Email</label>--%>
<%--                                            </div>--%>
<%--                                            <div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">--%>
<%--                                                <input type="email" class="form-control" />--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                    <div class="form-group-inner">--%>
<%--                                        <div class="row">--%>
<%--                                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">--%>
<%--                                                <label class="login2 pull-right pull-right-pro">Password</label>--%>
<%--                                            </div>--%>
<%--                                            <div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">--%>
<%--                                                <input type="password" class="form-control" />--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                    <div class="form-group-inner">--%>
<%--                                        <div class="row">--%>
<%--                                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">--%>
<%--                                                <label class="login2 pull-right pull-right-pro">Placeholder</label>--%>
<%--                                            </div>--%>
<%--                                            <div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">--%>
<%--                                                <input type="text" class="form-control" placeholder="Placeholder" />--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                    <div class="form-group-inner">--%>
<%--                                        <div class="row">--%>
<%--                                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">--%>
<%--                                                <label class="login2 pull-right pull-right-pro">Disabled</label>--%>
<%--                                            </div>--%>
<%--                                            <div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">--%>
<%--                                                <input type="text" disabled class="form-control" placeholder="Disabled input here..." />--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
                                    <button class="btn btn-primary d-flex justify-content-end" name="submit" type="submit">Submit</button>
                                </form>
                            </div>


                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
        </div>
    </div>
</div>
<jsp:include page="/Admin/components/scripts.jsp"/>
</body>
</html>
