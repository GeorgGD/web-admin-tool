<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Edit</title>

  <!-- Custom fonts for this template-->
  <link href="../vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="../css/sb-admin-2.min.css" rel="stylesheet">

  <!-- Custom styles for this page -->
  <link href="../vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

</head>

<body id="page-top">

  <!-- Page Wrapper -->
  <div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-dashboard sidebar sidebar-dark accordion" id="accordionSidebar">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="/">
        <div class="sidebar-brand-icon">
          <img src="../img/Logo-Georg_GD.png" alt="logo" class="logo">
        </div>
        <div class="sidebar-brand-text mx-3 text-orange">GeorgGD</div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <!-- Nav Item - Dashboard -->
      <li class="nav-item active">
        <a class="nav-link" href="/">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Dashboard</span></a>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider">

      <!-- Heading -->
      <div class="sidebar-heading">
        Addons
      </div>

      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages" aria-expanded="true" aria-controls="collapsePages">
          <i class="fas fa-fw fa-folder"></i>
          <span>Pages</span>
        </a>
        <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <h6 class="collapse-header">Webpages:</h6>
            <a class="collapse-item" href="index.html">Home</a>
            <a class="collapse-item" href="experiences.html">Experiences</a>
            <a class="collapse-item" href="mySkills.html">Skills</a>
            <a class="collapse-item" href="Projects.html">Projects</a>
            <a class="collapse-item" href="contact.html">Contact Me</a>
            <a class="collapse-item" href="Blog.html">Blog</a>
          </div>
        </div>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider d-none d-md-block">

      <!-- Sidebar Toggler (Sidebar) -->
      <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
      </div>

    </ul>
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">

        <!-- Begin Page Content -->
        <div class="container">

          <!-- Page Heading -->
          <div class="d-sm-flex align-items-center justify-content-between my-4">
            <h1 class="h3 mb-0 text-gray-800">Post Editor</h1>
          </div>

          <!-- DataTales Example -->
          <div class="card shadow mb-4">
            <div class="card-header py-3">
              <h6 class="m-0 font-weight-bold text-primary">Editor</h6>
            </div>
            <div class="card-body">

              <form:form class="user" action="createPost" modelAttribute="postData" method="post">
                <div class="form-group row">
                  <form:input type="number" class="form-control form-control-user col-5 mx-auto" path="ID" placeholder="ID"/>
                  <form:input type="text" class="form-control form-control-user col-5 mx-auto" path="post_date" placeholder="Date"/>
                </div>
                <div class="form-group row">
                  <form:input type="text" class="form-control form-control-user col-5 mx-auto" path="title" placeholder="Title"/>
                  <form:input type="text" class="form-control form-control-user col-5 mx-auto" path="short_desc" placeholder="Short Description"/>
                </div>
                <div class="form-group row">
                  <form:textarea path="post" class="form-control mx-5" rows="3" placeholder="Text"/>
                </div>
                <div class="container">
                  <button type="submit" class="btn btn-success btn-user btn-block col-4 mx-auto">
                    Submit
                  </button>

                </div>
                <hr>
              </form:form>

            </div>
          </div>

        </div>
        <!-- /.container-fluid -->

      </div>
      <!-- End of Main Content -->

      <!-- Footer -->
      <footer class="sticky-footer bg-white">
        <div class="container my-auto">
          <div class="copyright text-center my-auto">
            <span>Copyright &copy; Georgios Davakos 2021</span>
          </div>
        </div>
      </footer>
      <!-- End of Footer -->

    </div>
    <!-- End of Content Wrapper -->

  </div>
  <!-- End of Page Wrapper -->

  <!-- Bootstrap core JavaScript-->
  <script src="../vendor/jquery/jquery.min.js"></script>
  <script src="../vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="../vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="../js/sb-admin-2.min.js"></script>

  <!-- Page level plugins -->
  <script src="../vendor/datatables/jquery.dataTables.min.js"></script>
  <script src="../vendor/datatables/dataTables.bootstrap4.min.js"></script>

  <!-- Page level custom scripts -->
  <script src="../js/demo/datatables-demo.js"></script>
</body>

</html>
