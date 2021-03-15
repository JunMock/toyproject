<template>
  <q-layout>
    <Header></Header>
    <router-view />
    <Footer></Footer>
  </q-layout>
</template>

<script>
import Header from "./components/Header";
import Footer from "./components/Footer";
export default {
  name: "DefaultLayout",

  components: { Header, Footer },

  data() {
    return {};
  },
};
</script>

<style></style>
