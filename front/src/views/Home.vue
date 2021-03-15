<template>
  <q-layout>
    router
  </q-layout>
</template>

<script>
export default {
  methods: {
    getImgUrl(img) {
      return require("../assets/" + img);
    },
  },
  data() {},
  computed: {},
  mounted() {},
};
</script>

<style></style>
